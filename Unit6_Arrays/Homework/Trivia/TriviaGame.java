package Unit6_Arrays.Homework.Trivia;

import java.io.File;
import java.security.PrivateKey;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class TriviaGame {

    public static final String RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String PURPLE_BRIGHT = "\033[0;95m";
    public static final String BOXING = "\033[0;51m";   // BLACK


    private Question[] gameQuestions;
    private int score;
    private int answerStreak;
    private int numRight;

    public TriviaGame() {
        gameQuestions = new Question[12];
        this.score = 0;
        this.answerStreak = 0;
        this.numRight = 0;
    }




    public void fileRead(String filename) throws FileNotFoundException{

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

    public boolean checkArr(){
        int count = 0;
        for (Question q : gameQuestions){
            if (q == null){
                count++;
            }
        }

        if(count == 12){
            return false;
        } else{
            return true;
        }
    }


    public int askQuestion(){
        Scanner input = new Scanner(System.in);

        if(checkArr() == false){
            return -1;
        }

        int random = (int)(Math.random() * 12);
        while(gameQuestions[random] == null){
            if(random == 11){
                random = 0;
            } else{
                random++;
            }
        }

        System.out.println(gameQuestions[random].toString());
        System.out.print(ANSI_GREEN + "Your Answer: " + RESET);
        String response = input.nextLine().toLowerCase();

        if (response.equals(gameQuestions[random].getCorrectAnswer().toLowerCase())){
            numRight++;
            statsChange(true,gameQuestions[random].getPointValue(), gameQuestions[random].getCorrectAnswer());
            gameQuestions[random] = null;
            return 1;
        }else {
            statsChange(false,gameQuestions[random].getPointValue(), gameQuestions[random].getCorrectAnswer());
            gameQuestions[random] = null;
            return 0;
        }

    }

    public void statsChange(boolean isCorrect, int pointValue, String correctAnswer){
        if(isCorrect){
            score += pointValue;
            answerStreak++;
            System.out.println("Congrats! Your answer is correct! :)\n");
            System.out.println(BOXING + " You gained " + pointValue + " points " + RESET);
            printStats();
        } else {
            score -= pointValue;
            answerStreak = 0;
            System.out.println("Unfortunately Your answer is incorrect :(\n");
            System.out.println("The correct answer is: " + correctAnswer);
            System.out.println(BOXING + " You lost " + pointValue + " points " + RESET);
            printStats();
        }
    }

    public void printStats(){
        System.out.println(ANSI_GREEN + "**********STATS**********" + RESET);
        System.out.println(ANSI_BLUE + "SCORE: "+ score + RESET);
        System.out.println(ANSI_BLUE + "STREAK: "+ answerStreak + RESET);
        System.out.println(ANSI_BLUE + "QUESTION RIGHT: "+ numRight + RESET);
        System.out.println(ANSI_GREEN + "*************************\n" + RESET);
    }


    public static void IntroLogo(){
        System.out.println(PURPLE_BRIGHT + "                                              %@@@@@@@&                                                       \n" +
                "          &@@@@@@@@@@@@@@@ @@@@@@@@@@@@,     @@@@@@@@@@@    &@@@@@@@ @@@@@@@ @@@@@@@@     @@@@@@@&             \n" +
                "          &@@@ @@@@@@ @@@@ @@@@@@  @@@@@@   @@@@@@@@@@@@@    @@@@@@   @@@@@   @@@@@@     @@@@@@@@@             \n" +
                "               @@@@@@      @@@@@@  @@@@@@    @@@@@@@@@@@      @@@@@@ ,@@@@    @@@@@@    @@@@@(@@@@@            \n" +
                "               @@@@@@      @@@@@@@@@@@@        @@@@@@@         @@@@@ @@@@.    @@@@@@    @@@@  @@@@@@           \n" +
                "               @@@@@@      @@@@@@  @@@@@@                      %@@@@@@@@@     @@@@@@   @@@@@@ *@@@@@           \n" +
                "              @@@@@@@@    @@@@@@@@ @@@@@@@      @@@@@           @@@@@@@@     @@@@@@@@ @@@@@@@ @@@@@@@          \n" +
                "                                                 @@@                                                  " + RESET);
    }




    public Question[] getGameQuestions() { return gameQuestions; }
    public void setGameQuestions(Question[] gameQuestions) { this.gameQuestions = gameQuestions; }
    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }
    public int getAnswerStreak() { return answerStreak; }
    public void setAnswerStreak(int answerStreak) { this.answerStreak = answerStreak; }
    public int getNumRight() {return numRight;}
    public void setNumRight(int numRight) {this.numRight = numRight;}
}
