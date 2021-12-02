package Unit6_Arrays.Homework.Trivia;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class TriviaGame {
    private Question[] gameQuestion;
    private int score;
    private int answerStreak;

    public TriviaGame(int score, int answerStreak) {
        this.score = 0;
        this.answerStreak = 0;
    }




    public static void fileRead() throws FileNotFoundException{
        File myFile = new File("spaceTrivia.txt");
        Scanner fileIn = new Scanner(myFile);

        while (fileIn.hasNextLine()){
            String question = "";
            int pointValue = 0;
            String[] answerChoices = new String[4];
            String correctAnswer = "";
            Question[] questionsArr = new Question[12];

            for (int i = 0; i < 12; i++) {
                question = fileIn.nextLine();
                pointValue = fileIn.nextInt();
                fileIn.nextLine();
                for (int j = 0; j < 4; j++) {
                    String curAnswer = fileIn.nextLine();
                    int length = curAnswer.length();
                    if(curAnswer.substring(length-1, length).equals("*")){
                        correctAnswer = curAnswer;
                        curAnswer = curAnswer.substring(0, length-1);
                    }
                    answerChoices[j] = curAnswer;
                }
                questionsArr[i] = new Question(question, answerChoices, correctAnswer, pointValue);
            }
        }
    }




}
