package Unit6_Arrays.Homework.Trivia;

public class Question {
    private String question;
    private String[] answerChoices;
    private String correctAnswer;
    private int pointValue;

    public Question(String question, String[] answerChoices, String correctAnswer, int pointValue) {
        this.question = question;
        this.answerChoices = new String[4];
        this.correctAnswer = correctAnswer;
        this.pointValue = pointValue;
    }

    public String getQuestion() {return question;}
    public void setQuestion(String question) {this.question = question;}
    public String[] getAnswerChoices() {return answerChoices;}
    public void setAnswerChoices(String[] answerChoices) {this.answerChoices = answerChoices;}
    public String getCorrectAnswer() {return correctAnswer;}
    public void setCorrectAnswer(String correctAnswer) {this.correctAnswer = correctAnswer;}
    public int getPointValue() {return pointValue;}
    public void setPointValue(int pointValue) {this.pointValue = pointValue;}
}
