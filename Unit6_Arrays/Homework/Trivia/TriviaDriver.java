package Unit6_Arrays.Homework.Trivia;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;


public class TriviaDriver {
    public static final String RESET = "\u001B[0m";
    public static final String GREEN_BRIGHT = "\033[0;92m";
    public static final String TEAL = "\033[38;2;0;225;221m";
    public static final String GREEN = "\033[0;32m";
    public static final String BLUE = "\033[0;34m";


    private static int questionCount = 0;

    public static void main(String[] args) throws FileNotFoundException {
        TriviaGame game = new TriviaGame();
        Scanner input = new Scanner(System.in);
        game.fileRead("spaceTrivia.txt");
        TriviaGame.IntroLogo();

        System.out.println(TEAL + "Welcome to the Trivia Game! Here are the rules... You will be asked a question \n" +
                                        "and you will be given answer choice. Type one of the answers in to see if you \n" +
                                        "the question right or wrong. Each question has a point value that will be added \n" +
                                        "or subtracted and you answer streak will be tracked. After each question you can \n" +
                                        "choose if you want to keep playing your leave the game. Have fun!" + RESET);

        System.out.print(GREEN_BRIGHT + "Are you ready to start?(y/n): "+ RESET );

        if (input.nextLine().toLowerCase().equals("y")) {
            while (true) {
                for (int i = 0; i < 2; i++) { System.out.println(); }
                questionCount++;
                int endgame = game.askQuestion();

                if (endgame == -1){
                    System.out.println(GREEN_BRIGHT + "All Questions Have Been Asked" + RESET);
                    break;
                }

                System.out.print(GREEN_BRIGHT + "Next Question[1] or Quit[0]: " + RESET);
                if(input.nextLine().toLowerCase().equals("0")){
                    break;
                }
            }
        }

        int numWrong = questionCount -game.getNumRight();
        int Accuracy = game.getNumRight()/questionCount;

        System.out.println(GREEN + "********Finale STATS********" + RESET);
        System.out.println(BLUE + "SCORE: "+ game.getScore() + RESET);
        System.out.println(BLUE + "STREAK: "+ game.getAnswerStreak() + RESET);
        System.out.println(BLUE + "QUESTION RIGHT: "+ game.getNumRight() + RESET);
        System.out.println(BLUE + "QUESTION WRONG: "+numWrong + RESET);
        System.out.println(BLUE + "ACCURACY: "+ Accuracy + "%" + RESET);
        System.out.println(GREEN + "****************************\n" + RESET);
    }
}

