package Unit6_Arrays.Homework.Trivia;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class TriviaGame {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    private static Question[] gameQuestions;
    private static int score;
    private static int answerStreak;

    public TriviaGame() {
        gameQuestions = new Question[12];
        this.score = 0;
        this.answerStreak = 0;
    }




    public static void fileRead(String filename) throws FileNotFoundException{

        File myFile = new File(filename);
        Scanner fileIn = new Scanner(myFile);
        int count = 0;

        while (fileIn.hasNextLine()){
            String currQuestion = "";
            int pointValue = 0;
            String correctAnswer = "";
            String[] answerChoices = new String[4];


            currQuestion = fileIn.nextLine();
            pointValue = fileIn.nextInt();
            fileIn.nextLine();
            for (int j = 0; j < 4; j++) {
                String curAnswer = fileIn.nextLine();
                int length = curAnswer.length();
                if(curAnswer.substring(length-1, length).equals("*")){
                    correctAnswer = curAnswer.substring(0, length-1);
                    curAnswer = curAnswer.substring(0, length-1);
                }
                answerChoices[j] = curAnswer;

            }
            gameQuestions[count] = new Question(currQuestion, answerChoices, correctAnswer, pointValue);
            count++;

        }
    }


    public static boolean askQuestion(){
        Scanner input = new Scanner(System.in);
        int random = (int)(Math.random() * 12);
        System.out.println(gameQuestions[random].toString());
        //printStats();
        System.out.println(gameQuestions[random].getCorrectAnswer());
        System.out.print("Your Answer: ");
        String response = input.nextLine().toLowerCase();
        if (response.equals(gameQuestions[random].getCorrectAnswer())){
            return true;
        }else {
            return false;
        }
    }

    public static void printStats(){
        System.out.println(ANSI_GREEN + "**********STATS**********" + ANSI_RESET);
        System.out.println("SCORE: "+ score + ANSI_RESET);
        System.out.println("STREAK: "+ answerStreak + ANSI_RESET);
        System.out.println(ANSI_GREEN + "*************************" + ANSI_RESET);
    }


    public static void IntroLogo(){
        System.out.println(ANSI_PURPLE + "                                              %@@@@@@@&                                                       \n" +
                "          &@@@@@@@@@@@@@@@ @@@@@@@@@@@@,     @@@@@@@@@@@    &@@@@@@@ @@@@@@@ @@@@@@@@     @@@@@@@&             \n" +
                "          &@@@ @@@@@@ @@@@ @@@@@@  @@@@@@   @@@@@@@@@@@@@    @@@@@@   @@@@@   @@@@@@     @@@@@@@@@             \n" +
                "               @@@@@@      @@@@@@  @@@@@@    @@@@@@@@@@@      @@@@@@ ,@@@@    @@@@@@    @@@@@(@@@@@            \n" +
                "               @@@@@@      @@@@@@@@@@@@        @@@@@@@         @@@@@ @@@@.    @@@@@@    @@@@  @@@@@@           \n" +
                "               @@@@@@      @@@@@@  @@@@@@                      %@@@@@@@@@     @@@@@@   @@@@@@ *@@@@@           \n" +
                "              @@@@@@@@    @@@@@@@@ @@@@@@@      @@@@@           @@@@@@@@     @@@@@@@@ @@@@@@@ @@@@@@@          \n" +
                "                                                 @@@                                                  " + ANSI_RESET);
    }




    public static Question[] getGameQuestions() { return gameQuestions; }
    public static void setGameQuestions(Question[] gameQuestions) { TriviaGame.gameQuestions = gameQuestions; }
    public static int getScore() { return score; }
    public static void setScore(int score) { TriviaGame.score = score; }
    public static int getAnswerStreak() { return answerStreak; }
    public static void setAnswerStreak(int answerStreak) { TriviaGame.answerStreak = answerStreak; }
}
