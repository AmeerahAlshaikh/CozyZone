
package cozyzone;
import java.io.PrintWriter;

 public class MoodTracker {
   private String moodOptions[] = {"Depressed","Sad","Normal","Pleasant","Happy"};
   private String[] userMoodArray = new String[2000];// new attribute 
   private String userMood ;// also new 

    public MoodTracker(String[] moodOptions) {
        this.moodOptions = moodOptions;
    }

    public MoodTracker() {
        this.userMoodArray = userMoodArray ;
    }

    public String[] getMoodOptions() {
        return moodOptions;
    }

    public void setMoodOptions(String[] moodOptions) {
        this.moodOptions = moodOptions;
    }
    
    public void ShowMoodTracker(PrintWriter output){
        output.println("How are you feeling today ?");
        output.print("( ");
        for (int i =0 ; i< moodOptions.length;i++){
            
            if(i+1 != moodOptions.length)
            output.print(moodOptions[i]+" ,");
              else
               output.print(moodOptions[i]+" "); 
        }
        output.println(")? ");  
    }  
    
    public void SaveMoodInfo(String userMood,int counter){
        
        userMoodArray[counter] = userMood;
        
    }
    
    public void analyzeMoods(PrintWriter output,int counter){
       output.println("Your previous moods are:");
       
        for (int i =0 ; i< counter;i++){
            output.print(userMoodArray[i]+" ");
               
        }
    }
    
    
   
}
