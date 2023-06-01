package cozyzone;

import java.io.PrintWriter;
import java.util.*;

public class Diary {

    private String DiaryTitle;
    private String DiaryDate;
    private String DiaryBody;

    public Diary(String DiaryTitle, String DiaryDate, String DiaryBody) {
        this.DiaryTitle = DiaryTitle;
        this.DiaryDate = DiaryDate;
        this.DiaryBody = DiaryBody;
    }

    Diary() {

    }

    public String getDiaryTitle() {
        return DiaryTitle;
    }

    public String getDiaryDate() {
        return DiaryDate;
    }

    public String getDiaryBody() {
        return DiaryBody;
    }

    public void setDiaryTitle(String DiaryTitle) {
        this.DiaryTitle = DiaryTitle;
    }

    public void setDiaryDate(String DiaryDate) {
        this.DiaryDate = DiaryDate;
    }

    public void setDiaryBody(String DiaryBody) {
        this.DiaryBody = DiaryBody;
    }
    
    public Diary searchDiary(ArrayList<Diary> diaryPages, String title) {
        Diary page = null ;
        boolean flag = true ;
        for (int i = 0 ; i < diaryPages.size() ; i++) {
            if (diaryPages.get(i).getDiaryTitle().equalsIgnoreCase(title)) {
                page = diaryPages.get(i) ;
                flag = true ;
            }
        }
        
        if (flag == true) {
            return page ;
        }
        else {
            return null ;
        }
    }

}
