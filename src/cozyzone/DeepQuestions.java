
package cozyzone;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DeepQuestions {
    private String questionTitle;
    private String openEndedAnswer;
    private String[] CloseEndedAnswer;

    public DeepQuestions(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public String getOpenEndedAnswer() {
        return openEndedAnswer;
    }

    public String[] getCloseEndedAnswer() {
        return CloseEndedAnswer;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public void setOpenEndedAnswer(String openEndedAnswer) {
        this.openEndedAnswer = openEndedAnswer;
    }

    public void setCloseEndedAnswer(String[] CloseEndedAnswer) {
        this.CloseEndedAnswer = CloseEndedAnswer;
    }

    public static void generateQuestions(DeepQuestions[] questions, Scanner input) {
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println("Write your answer:");
            String answer = input.nextLine();
            String answerp2= "";
            if (i == 0) {
                if (answer.equalsIgnoreCase("bad")) {
                    System.out.println(
                            "What do you feel exactly? (bored, busy, stressed, tired, overwhelmed, unfocussed, out of control)");
                    answerp2 = input.nextLine();
                } else if (answer.equalsIgnoreCase("fearful")) {
                    System.out.println(
                            "What do you feel exactly? (Threatened, rejected, weak, inscure, anxious, scared, overwhelmed, worried, nervous, worthless)");
                    answerp2 = input.nextLine();
                } else if (answer.equalsIgnoreCase("angry")) {
                    System.out.println(
                            "What do you feel exactly? (betrayed, humiliated, mad, aggresive, frustrated, annoyed, jealos, disrespected)");
                    answerp2 = input.nextLine();
                } else if (answer.equalsIgnoreCase("disgusted")) {
                    System.out.println("What do you feel exactly? (disappointed, awful, embarrassed, horrified)");
                    answerp2 = input.nextLine();

                } else if (answer.equalsIgnoreCase("sad")) {
                    System.out.println(
                            "What do you feel exactly? (hurt, depressed, guilty, vulnrable, lonely, isolated, abandoned, victimized, grief, powerless, ashamed, empty)");
                    answerp2 = input.nextLine();
                } else if (answer.equalsIgnoreCase("else")) {
                    System.out.println("What do you feel exactly? ");
                    answerp2 = input.nextLine();
                } else {
                    System.out.println("Sorry! enter the feeling again");
                    answerp2 = input.nextLine();
                }
                String finalanswer= answer+ " ,"+answerp2; 
                System.out.println(finalanswer);
                questions[i].setOpenEndedAnswer(finalanswer);
            }
            questions[i].setOpenEndedAnswer(answer);
        }

    }

    @Override
    public String toString() {
        return " " + questionTitle;
    }

    public static void add2File(DeepQuestions[] questions, File deepQuestionsOutput, FileWriter myWriter) {

        for (int i = 0; i < questions.length; i++) {
           try {
            myWriter.write("Question: " + questions[i].getQuestionTitle()
                        + " \n Your answer: " + questions[i].getOpenEndedAnswer()
                        + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
            
    }

}
