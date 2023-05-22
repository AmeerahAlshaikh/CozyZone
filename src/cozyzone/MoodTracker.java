
package cozyzone;
class MoodTracker {
   private String[] moodOptions[];

    public MoodTracker(String[][] moodOptions) {
        this.moodOptions = moodOptions;
    }

    public String[][] getMoodOptions() {
        return moodOptions;
    }

    public void setMoodOptions(String[][] moodOptions) {
        this.moodOptions = moodOptions;
    }
   
}
