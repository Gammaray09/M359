package Unit6_Arrays.Homework.Trivia;

import java.util.Arrays;

public class Question {
    private String question;
    private String[] answerChoices;
    private String correctAnswer;
    private int pointValue;

    public Question(String question, String[] answerChoices, String correctAnswer, int pointValue) {
        this.question = question;
        this.answerChoices = answerChoices;
        this.correctAnswer = correctAnswer;
        this.pointValue = pointValue;
    }


    public String toString() {
        String output = question + "\n";
        output += "**This question is worth " + pointValue + " points**\n";
        for ( String s : answerChoices) {
            output += "\t" + s + "\n";
        }
        return output;
    }
}
