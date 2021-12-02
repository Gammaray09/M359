package Unit6_Arrays.Homework.Trivia;

public class TriviaGame {
    Question[] gameQuestion;
    int score;
    int answerStreak;

    public TriviaGame(Question[] gameQuestion, int score, int answerStreak) {
        this.gameQuestion = new Question[12];
        this.score = score;
        this.answerStreak = answerStreak;
    }

    public Question[] getGameQuestion() {return gameQuestion;}
    public void setGameQuestion(Question[] gameQuestion) {this.gameQuestion = gameQuestion;}
    public int getScore() {return score;}
    public void setScore(int score) {this.score = score;}
    public int getAnswerStreak() {return answerStreak;}
    public void setAnswerStreak(int answerStreak) {this.answerStreak = answerStreak;}
}
