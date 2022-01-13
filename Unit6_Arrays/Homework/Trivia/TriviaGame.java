package Unit6_Arrays.Homework.Trivia;

import java.io.File;
import java.security.PrivateKey;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class TriviaGame {

    //Colors used for text output
    public static final String RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String PURPLE_BRIGHT = "\033[0;95m";
    public static final String BOXING = "\033[0;51m";
    public static final String GREEN = "\033[0;32m";
    public static final String BLUE = "\033[0;34m";

    // instance variables
    private Question[] gameQuestions;
    private int score;
    private int answerStreak;
    private int numRight;

    //constructor sets array length to 12 and the rest of the variables to zero
    public TriviaGame() {
        gameQuestions = new Question[12];
        this.score = 0;
        this.answerStreak = 0;
        this.numRight = 0;
    }


    /**
     * This method reads the text file that is passed in and
     * makes each question into an question object. The question objects are then
     * added to the gameQuestions array
     *
     * @param filename takes in a the name of the file as a string
     * @throws FileNotFoundException
     */
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


    /**
     * Checks to see if the array is all null and returns true if it is
     * This method is used see if alll questions have been asked
     *
     * @return returns a true or false
     */
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


    /**
     * This method asks a random question from the array and takes in the users input.
     * This method calls the statsChange method to change the score of the player depending on if they
     * got the answer right or wrong.
     *
     * @return returns 1 if answer is right, 0 if answer wrong, and -1 if all question have been asked
     */
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


    /**
     * This method changes the score and stats of the player depending on if they got
     * the answer right or wrong. This method also lets the player know if they got it right or wrong,
     * the correct answer, and their current stats.
     *
     * @param isCorrect variable to see if answer was correct or not
     * @param pointValue how much the current question is worth
     * @param correctAnswer what the answer of the current question is
     */
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


    /**
     * Prints that stats and score of the player is a specific format
     */
    public void printStats(){
        System.out.println(ANSI_GREEN + "**********STATS**********" + RESET);
        System.out.println(ANSI_BLUE + "SCORE: "+ score + RESET);
        System.out.println(ANSI_BLUE + "STREAK: "+ answerStreak + RESET);
        System.out.println(ANSI_BLUE + "QUESTION RIGHT: "+ numRight + RESET);
        System.out.println(ANSI_GREEN + "*************************\n" + RESET);
    }


    /**
     *
     * This method prints the final stats of the game in proper format
     * numWrong and accuracy are calculated before method is called
     *
     * @param numWrong passes in an int for number of questions wrong
     * @param accuracy passes in a double for accuracy
     */
    public void printFinaleStats(int numWrong, double accuracy){
        System.out.println(GREEN + "********Finale STATS********" + RESET);
        System.out.println(BLUE + "SCORE: "+ score + RESET);
        System.out.println(BLUE + "STREAK: "+ answerStreak + RESET);
        System.out.println(BLUE + "QUESTION RIGHT: "+ numRight + RESET);
        System.out.println(BLUE + "QUESTION WRONG: "+numWrong + RESET);
        System.out.println(BLUE + "ACCURACY: "+ accuracy + "%" + RESET);
        System.out.println(GREEN + "****************************\n" + RESET);
    }

    /**
     * Prints intro logo for the program
     */
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



    //Accessor methods
    public Question[] getGameQuestions() { return gameQuestions; }
    public void setGameQuestions(Question[] gameQuestions) { this.gameQuestions = gameQuestions; }
    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }
    public int getAnswerStreak() { return answerStreak; }
    public void setAnswerStreak(int answerStreak) { this.answerStreak = answerStreak; }
    public int getNumRight() {return numRight;}
    public void setNumRight(int numRight) {this.numRight = numRight;}
}
