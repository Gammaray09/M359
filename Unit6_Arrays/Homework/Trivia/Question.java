package Unit6_Arrays.Homework.Trivia;


public class Question {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

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


    public String getQuestion() { return question; }
    public void setQuestion(String question) { this.question = question; }
    public String[] getAnswerChoices() { return answerChoices; }
    public void setAnswerChoices(String[] answerChoices) { this.answerChoices = answerChoices; }
    public String getCorrectAnswer() { return correctAnswer; }
    public void setCorrectAnswer(String correctAnswer) { this.correctAnswer = correctAnswer; }
    public int getPointValue() { return pointValue; }
    public void setPointValue(int pointValue) { this.pointValue = pointValue; }




    public String toString() {
        String output = question + "\n";
        output += ANSI_BLUE + " **This question is worth " + pointValue + " points**\n" + ANSI_RESET;
        for ( String s : answerChoices) {
            output += ANSI_PURPLE + "\t" + s + "\n" + ANSI_RESET;
        }
        return output;
    }
}
