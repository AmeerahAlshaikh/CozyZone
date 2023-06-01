package cozyzone;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class User {

    static ArrayList<Diary> diaryPages = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        String userName = "";
        int UserId = 0;

        File DeepQuestionsFile = new File("Questions.txt");

        FileWriter myWriter;
        File outputFile = new File("outputFile.txt");
        File diaryoutput = new File("outputdiary.txt");// store the user diary
        Scanner user = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        Scanner scanner = new Scanner(new File("Questions.txt"));

        // define printwriter object to write on the output file
        PrintWriter output = new PrintWriter(outputFile);
        PrintWriter diaryprint = new PrintWriter(diaryoutput);

        // new attribute
        Diary WriteDiary = new Diary();
        MoodTracker userMood = new MoodTracker();

        int moodCounter = 0;
        String mood = null;

        System.out.println("Welcome to CozyZone :3 \n your safe space <33") ;
        System.out.println();
        System.out.println("---------------------------------------------------");
        System.out.println("Please enter the number of the service ");

        int userchoice;

        do {
            
            System.out.println(
                    "1- Write a dairy \n2- Modify a diary \n3- Search for a diary \n4- Add today's mood \n5- Show your moods "
                    + "\n6- Generating questions \n7- Quit");

            userchoice = user.nextInt();
            if (userchoice == 1) {
                Write(user, in, WriteDiary, diaryprint);
                System.out.println("---------------------------------------------------");
            } else if (userchoice == 2) {
                System.out.println("---------------------------------------------------");
                System.out.println("Do you want to modify your diary? yes or no\n");
                String Answer = user.next();
                if (Answer.equalsIgnoreCase("yes")) {
                    ModifyDiary(user, WriteDiary, diaryprint);
                } else if (Answer.equalsIgnoreCase("no")) {
                    diaryprint.print("Date: " + WriteDiary.getDiaryDate());
                    diaryprint.print("Diary Title: " + WriteDiary.getDiaryTitle() + "\n");
                    diaryprint.print(WriteDiary.getDiaryBody());
                }
                System.out.println("---------------------------------------------------");
            }
            else if (userchoice == 3) {
                System.out.println("Enter the title of the diary you want to find");
                String title = user.next() ;
                Diary result = new Diary() ;
                result = result.searchDiary(diaryPages, title) ;
                if (result != null) {
                    System.out.println(result.getDiaryBody());
                    System.out.println("---------------------------------------------------");
                }
                else {
                    System.out.println("Woops! there is no such diary title");
                    System.out.println("---------------------------------------------------");
                }
            }
            else if (userchoice == 4) {
                mood = user.next();
                FillMoodTracker(userMood, moodCounter, output, mood);
                moodCounter++;
                System.out.println("---------------------------------------------------");
            } else if (userchoice == 5) {
                AccessMoodTracker(userMood, output, moodCounter);
                System.out.println("---------------------------------------------------");
            } else if (userchoice == 6) {
                DeepQuestions[] questions = new DeepQuestions[10];
                for (int i = 0; i < questions.length; i++) {
                    questions[i] = Addquestion(scanner);
                }
                DeepQuestions.generateQuestions(questions, in);

                File DeepQuestionsOutput = new File("DeepQuestionsOutput.txt");
                myWriter = new FileWriter(DeepQuestionsOutput);
                DeepQuestions.add2File(questions, DeepQuestionsOutput, myWriter);
                myWriter.close();
                System.out.println("---------------------------------------------------");
            }
            else if (userchoice == 7) {
                break ;
            }
            else {
                System.out.println("Wrong choice! Choose again");
                System.out.println("---------------------------------------------------");

            }
        } while (userchoice != 7);
        System.out.println("Bye <3");
        // end of program
        output.flush();
        output.close();

        diaryprint.close();
        diaryprint.flush();

    }

    // this method allow the user to write diary
    public static void Write(Scanner user, Scanner in, Diary WriteDiary, PrintWriter diaryprint) {
        String body;
        // the user enter their diary name
        System.out.println("Enter your Diary Title:");
        String name = in.nextLine();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String diarydate = dtf.format(now);
        // start write diary
        System.out.println("start writing! If you want to stop, enter 'qdiary'.");
        // stringbuilder for terminal storage
        StringBuilder storage = new StringBuilder();
        while (true) {
            body = user.next();
            // check
            if (body.equalsIgnoreCase("qdiary")) {
                break;
            }
            // append the user enter in stringbuilder
            storage.append(body).append(" ");
        }
        // set the enter name and body
        WriteDiary.setDiaryTitle(name);
        WriteDiary.setDiaryDate(diarydate);
        WriteDiary.setDiaryBody(storage.toString());
        diaryPages.add(new Diary(name, diarydate, storage.toString()));

        // print in the output file
        System.out.println("---------------------------------------------------");
        System.out.println("Diary info:");
        System.out.println("Date: " + WriteDiary.getDiaryDate());
        System.out.print("Diary Title: " + WriteDiary.getDiaryTitle() + "\n");
        System.out.print(WriteDiary.getDiaryBody() + "\n");

    }

    // this method allow the user to modify their diary
    public static void ModifyDiary(Scanner user, Diary WriteDiary, PrintWriter diaryprint) {
        String body;
        System.out.println("\nCopy and modify If you want to stop, enter 'qdiary'.");
        StringBuilder modify = new StringBuilder();
        while (true) {
            body = user.next();
            // check
            if (body.equalsIgnoreCase("qdiary")) {
                break;
            }
            // append the user modify in stringbuilder
            modify.append(body).append(" ");
        }
        WriteDiary.setDiaryBody(modify.toString());
        diaryprint.print("Diary Title: " + WriteDiary.getDiaryTitle() + "\n");
        diaryprint.print("Date: " + WriteDiary.getDiaryDate());
        diaryprint.print(WriteDiary.getDiaryBody());

    }

    // this method show report of previous mood trackers filled by the user
    public static void AccessMoodTracker(MoodTracker userMood, PrintWriter output, int counter) {
        userMood.analyzeMoods(output, counter);

    }

    // this method allow user to enter new mood
    public static void FillMoodTracker(MoodTracker userMood, int counter, PrintWriter output,
            String mood) {

        userMood.ShowMoodTracker(output);

        // String mood = scan.nextLine();
        output.println("i am feeling " + mood + "\n");
        userMood.SaveMoodInfo(mood, counter);

    }

    public static DeepQuestions Addquestion(Scanner scanner) {
        String questionTitle = scanner.nextLine();
        DeepQuestions Question = new DeepQuestions(questionTitle);
        return Question;
    }

}
