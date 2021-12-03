package Unit6_Arrays.Homework.Trivia;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;


public class TriviaDriver {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";


    public static void main(String[] args) throws FileNotFoundException {
        new TriviaGame();
        Scanner input = new Scanner(System.in);
        TriviaGame.fileRead("spaceTrivia.txt");
        TriviaGame.IntroLogo();

        System.out.println("Welcome to the Trivia Game!");
        System.out.println("Are you ready to start?(" + ANSI_GREEN + "y" + ANSI_RESET + "/"
                + ANSI_RED + "n" + ANSI_RESET + ")");
        if (input.nextLine().toLowerCase().equals("y")) {
            Boolean continuePlaying = true;
            while (continuePlaying) {
                for (int i = 0; i < 2; i++) { System.out.println(); }
                if (TriviaGame.askQuestion()) {
                    System.out.println("correct");
                } else {
                    System.out.println("Wrong");
                }

            }
        }
    }
}

