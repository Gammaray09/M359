package Unit6_Arrays.Homework.Trivia;


public class Question {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static final String PURPLE_BRIGHT = "\033[0;95m";


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
        String output = PURPLE_BRIGHT  + question + "\n" + ANSI_RESET;
        output += BLUE_BOLD + "**" + pointValue + " points**\n" + ANSI_RESET;
        for ( String s : answerChoices) {
            output += "\t-" + s + "\n";
        }
        return output;
    }


}
