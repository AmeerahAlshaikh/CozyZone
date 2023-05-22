package cozyzone;

import java.util.Date;

class Diary {
    private String DiaryName;
    private Date DiaryDate;
    private String DiaryBody;

    public Diary(String DiaryName, Date DiaryDate, String DiaryBody) {
        this.DiaryName = DiaryName;
        this.DiaryDate = DiaryDate;
        this.DiaryBody = DiaryBody;
    }

    public String getDiaryName() {
        return DiaryName;
    }

    public Date getDiaryDate() {
        return DiaryDate;
    }

    public String getDiaryBody() {
        return DiaryBody;
    }

    public void setDiaryName(String DiaryName) {
        this.DiaryName = DiaryName;
    }

    public void setDiaryDate(Date DiaryDate) {
        this.DiaryDate = DiaryDate;
    }

    public void setDiaryBody(String DiaryBody) {
        this.DiaryBody = DiaryBody;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
