
package cozyzone;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PipedWriter;
import java.io.PrintWriter;

public class User {
    public static void main(String[] args) throws FileNotFoundException {
     
        String userName="";
        int UserId=0;
        
        // define file and scanner objects to read input file
        File inputFile = new File ("userCommands.txt");
        File outputFile = new File ("outputFile.txt");
        Scanner scan = new Scanner(inputFile);
        
        //define printwriter object to write on the output file
        PrintWriter output = new PrintWriter(outputFile);
        
        //if the file does not exist, the program shall end
        if (!(inputFile.exists())){
            System.out.println("The input file does not exists");
            System.exit(0);
        }
        
        // new attribute 
        MoodTracker userMood = new MoodTracker();
        int moodCounter = 0;
        String mood= null ;
        
        //reading from input file
        String command = null;
        
        do{
            command = scan.next();
            //write diary command
            if (command.equalsIgnoreCase("")){
                
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

    }
    
    
    public static Diary RequestNewPage(){
        return null;     
    }
    public static Diary Write(){
        return null;
    }
    public static Diary ModifyDiary(){
        return null;
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
