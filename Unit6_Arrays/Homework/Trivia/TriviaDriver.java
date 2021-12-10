package Unit6_Arrays.Homework.Trivia;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;


public class TriviaDriver {
    // Colors used for text output
    public static final String RESET = "\u001B[0m";
    public static final String GREEN_BRIGHT = "\033[0;92m";
    public static final String TEAL = "\033[38;2;0;225;221m";
    public static final String GREEN = "\033[0;32m";
    public static final String BLUE = "\033[0;34m";
    public static final String RED = "\033[0;31m";
    public static final String RED_BRIGHT = "\033[0;91m";    // RED

    // counts how many question have been asked
    private static int questionCount = 0;

    public static void main(String[] args) throws FileNotFoundException {
        // creates new game object and scanner object
        TriviaGame game = new TriviaGame();
        Scanner input = new Scanner(System.in);

        //calls method that reads file
        game.fileRead("spaceTrivia.txt");
        TriviaGame.IntroLogo();

        // Asks user for name
        System.out.print(GREEN_BRIGHT +  "Hello Player! What is your name? "+ RESET);
        String name = input.nextLine();

        //instructions
        System.out.println(TEAL + "Hello " + name+  "! Welcome to the Trivia Game! Here are the rules... You will be asked a question \n" +
                                        "and you will be given answer choice. Type one of the answers in to see if you \n" +
                                        "the question right or wrong. Each question has a point value that will be added \n" +
                                        "or subtracted and you answer streak will be tracked. After each question you can \n" +
                                        "choose if you want to keep playing your leave the game. Have fun!" + RESET);

        System.out.print(GREEN_BRIGHT + "Are you ready to start?(y/n): "+ RESET );

        boolean stillPlaying = true;

        // if statement to see if players wants to start game
        if (input.nextLine().toLowerCase().equals("y")) {
            while (stillPlaying) {
                for (int i = 0; i < 2; i++) { System.out.println(); }
                questionCount++;
                // stores number returned from askQuestion method
                int endgame = game.askQuestion();

                // means that all question have been asked
                //asks if player wants to player again
                if (endgame == -1){
                    System.out.println(GREEN_BRIGHT + "All Questions Have Been Asked" + RESET);

                    //calculates and prints final stats
                    int numWrong = questionCount -game.getNumRight();
                    double Accuracy = (game.getNumRight()/(double)questionCount) * 100;
                    game.printFinaleStats(numWrong, Accuracy);


                    System.out.print(GREEN_BRIGHT + "Do you want to play again?(y/n): " + RESET);
                    String playAgain = input.nextLine();
                    if (playAgain.toLowerCase().equals("y")){
                        //question array is reset
                        game.fileRead("spaceTrivia.txt");
                        game.IntroLogo();
                    }else{
                        System.out.println("Thanks For Playing!");
                        // program is ended
                        break;
                    }
                }

                // asks if players want to continue after question
                System.out.print(GREEN_BRIGHT + "Next Question[1] or Quit[0]: " + RESET);
                if(input.nextLine().toLowerCase().equals("0")){
                    // player did not want to continue and while loop is broken
                    break;
                }
            }
        } else {
            // what happens when you annoy the program
            System.out.println(RED + "Are you kidding me? Why would you even run the program if you did not want to play.\n" +
                    "Do you know how long it takes to set up everything!? Did you not see the logo I made \n" +
                    "completely in ASCII? That clever design was not easy to make. I also said all of the\n" +
                    "instructions and now you are telling me that you don't want to play. Fine...I guess\n " +
                    "I will have to annoy you until you say yes." + RESET);
            while (true){
                System.out.print(RED_BRIGHT + "Do you want to play now?(y/n): " + RESET);
                String userInput = input.nextLine();
                if(userInput.equals("y")) {
                    System.out.println(RED_BRIGHT + "Too Late" + RESET);
                }
            }
        }

    }
}

