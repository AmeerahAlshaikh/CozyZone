package cozyzone;

import java.io.PrintWriter;
import java.util.Date;

public class Diary {
    private String DiaryTitle ;
    private String DiaryDate;
    private String DiaryBody;

   

    public Diary(String DiaryTitle, String DiaryDate,String DiaryBody) {
        this.DiaryTitle = DiaryTitle;
        DiaryDate = DiaryDate; 
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
