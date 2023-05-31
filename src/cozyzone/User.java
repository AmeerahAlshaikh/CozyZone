
package cozyzone;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PipedWriter;
import java.io.PrintWriter;
import java.util.Date;

public class User {
    public static void main(String[] args) throws FileNotFoundException {
     
        String userName="";
        int UserId=0;
        
        // define file and scanner objects to read input file
        File inputFile = new File ("userCommands.txt");
        File outputFile = new File ("outputFile.txt");
        File diaryoutput = new File("outputdiary.txt");//store the user diary
        Scanner scan = new Scanner(inputFile);
        Scanner user = new Scanner(System.in);
        
        //define printwriter object to write on the output file
        PrintWriter output = new PrintWriter(outputFile);
        PrintWriter diaryprint = new PrintWriter(diaryoutput);
        
        //if the file does not exist, the program shall end
        if (!(inputFile.exists())){
            System.out.println("The input file does not exists");
            System.exit(0);
        }
        
        // new attribute 
        Diary WriteDiary = new Diary();
        MoodTracker userMood = new MoodTracker();
       
        int moodCounter = 0;
        String mood= null ;
        
        //reading from input file
        String command = scan.next();
        
        do{
           
            //write diary command
            if (command.equalsIgnoreCase("writeDiary")){
               
                 Write(user,WriteDiary,diaryprint);
                 
                command = scan.next();
            }
            //modify diary command
            else if (command.equalsIgnoreCase("modifyDiary")){
                System.out.println("---------------------------------------------------");
                System.out.println("Do you want to modify your diary? yes or no\n");
                String Answer = user.next();
                   if(Answer.equalsIgnoreCase("yes")){
                       ModifyDiary(user,WriteDiary,diaryprint);
                  }
                 else if(Answer.equalsIgnoreCase("no")){
                    diaryprint.print("Date: " +WriteDiary.getDiaryDate());
                    diaryprint.print("Diary Title: "+ WriteDiary.getDiaryTitle()+"\n");
                    diaryprint.print(WriteDiary.getDiaryBody());
                    
               }
                    command = scan.next();
            }
          
            
            //search diary command
            else if (command.equalsIgnoreCase("")){
                
            }
            //mood tracker command
            //to add new mood
            else if (command.equalsIgnoreCase("addMood")){
                 command = scan.next();
                 mood = command;
                FillMoodTracker(userMood,scan,moodCounter,output,mood);
                moodCounter++;
            }
            //show previous moods
            else if (command.equalsIgnoreCase("showMood")){
                
                AccessMoodTracker(userMood,output,moodCounter);
                
            }
            //answer deep quastions commmand 
            else if (command.equalsIgnoreCase("")){
                
            } 
            
        }while (!command.equalsIgnoreCase("QUIT"));
        
        
        //end of program 
        output.flush();
        output.close();
        
        diaryprint.close();
        diaryprint.flush();
       

    }
    
    
    //this method allow the user to write diary
    public static void Write(Scanner user,Diary WriteDiary,PrintWriter diaryprint){
         String body;
        //the user enter their diary name      
        System.out.print("Enter your Diary Title:");
        String name = user.nextLine();
        System.out.print("Enter Date:");
        String Date = user.nextLine();
        //start write diary 
        System.out.println("START WRITING! If you want to stop, enter 'qdiary'.");
        //stringbuilder for terminal storage
        StringBuilder storage = new StringBuilder();
        while(true){
         body = user.next();
         //check 
         if(body.equalsIgnoreCase("qdiary")){
             break;
         }
         //append the user enter in stringbuilder
         storage.append(body).append(" ");
        }
        //set the enter name and body
        WriteDiary.setDiaryTitle(name);
        WriteDiary.setDiaryDate(Date);
        WriteDiary.setDiaryBody(storage.toString());
        //print in the output file
        System.out.println("---------------------------------------------------");
        System.out.println("Diary info:");
        System.out.println("Date: " +WriteDiary.getDiaryDate());
        System.out.print("Diary Title: "+ WriteDiary.getDiaryTitle()+"\n");
        System.out.print(WriteDiary.getDiaryBody()+"\n");
       
    }
    //this method allow the user to modify their diary 
    public static void ModifyDiary(Scanner user,Diary WriteDiary,PrintWriter diaryprint){
        String body;
        System.out.println("\nCopy and modify If you want to stop, enter 'qdiary'.");
        StringBuilder modify = new StringBuilder();
        while(true){
         body = user.next();
         //check 
         if(body.equalsIgnoreCase("qdiary")){
             break;
         }
         //append the user modify in stringbuilder
         modify.append(body).append(" ");
        }
        WriteDiary.setDiaryBody(modify.toString());
        diaryprint.print("Diary Title: "+ WriteDiary.getDiaryTitle()+"\n");
        diaryprint.print("Date: " +WriteDiary.getDiaryDate());
        diaryprint.print(WriteDiary.getDiaryBody());
        
    }
    
    //this method show report of previous mood trackers filled by the user
    public static void AccessMoodTracker(MoodTracker userMood, PrintWriter output,int counter){
      userMood.analyzeMoods(output,counter);
    
    }
    //this method allow user to enter new mood
    public static void FillMoodTracker(MoodTracker userMood,Scanner scan,int counter,PrintWriter output,String mood){
       
        userMood.ShowMoodTracker(output);
        
       // String mood = scan.nextLine();
        output.println("i am feeling "+mood+ "\n");
        userMood.SaveMoodInfo(mood,counter);
        
    }
    public static String[] AnswerDeepQuestions(){
        return null;
    }
    public static Diary SearchForDiary(String keyword){
        return null;
    }
}
