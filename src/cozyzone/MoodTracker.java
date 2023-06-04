
package cozyzone;

import java.io.PrintWriter;

public class MoodTracker {
    private String moodOptions[] = { "Depressed", "Sad", "Normal", "Pleasant", "Happy" };
    private String[] userMoodArray = new String[2000];// new attribute
    private String userMood;// also new

    public MoodTracker(String[] moodOptions) {
        this.moodOptions = moodOptions;
    }

    public MoodTracker() {
        this.userMoodArray = userMoodArray;
    }

    public String[] getMoodOptions() {
        return moodOptions;
    }

    public void setMoodOptions(String[] moodOptions) {
        this.moodOptions = moodOptions;
    }

    public void ShowMoodTracker() {
        System.out.println("How are you feeling today ?");
        System.out.print("( ");
        for (int i = 0; i < moodOptions.length; i++) {

            if (i + 1 != moodOptions.length)
                System.out.print(moodOptions[i] + ", ");
            else
                System.out.print(moodOptions[i] + " ");
        }
        System.out.println(")? ");
    }

    public void SaveMoodInfo(String userMood, int counter) {

        userMoodArray[counter] = userMood;

    }


    public void analyzeMoods(PrintWriter output, int counter) {
        output.println("Your previous moods are:");
        System.out.println("Your previous moods are:");
        for (int i = 0; i < counter; i++) {
            output.print(userMoodArray[i] + " ");
            System.out.println(userMoodArray[i] + " ");
        }
    }

}
