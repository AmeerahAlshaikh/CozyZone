
package cozyzone;
class DeepQuestions {
    private String[] Questions[];
    private String openEndedAnswer;
    private String CloseEndedAnswer;

    public DeepQuestions(String[][] Questions, String openEndedAnswer, String CloseEndedAnswer) {
        this.Questions = Questions;
        this.openEndedAnswer = openEndedAnswer;
        this.CloseEndedAnswer = CloseEndedAnswer;
    }

    public String[][] getQuestions() {
        return Questions;
    }

    public String getOpenEndedAnswer() {
        return openEndedAnswer;
    }

    public String getCloseEndedAnswer() {
        return CloseEndedAnswer;
    }

    public void setQuestions(String[][] Questions) {
        this.Questions = Questions;
    }

    public void setOpenEndedAnswer(String openEndedAnswer) {
        this.openEndedAnswer = openEndedAnswer;
    }

    public void setCloseEndedAnswer(String CloseEndedAnswer) {
        this.CloseEndedAnswer = CloseEndedAnswer;
    }
    
    
            
    
}
