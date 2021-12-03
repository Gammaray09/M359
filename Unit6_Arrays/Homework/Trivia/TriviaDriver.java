package Unit6_Arrays.Homework.Trivia;
import java.io.FileNotFoundException;
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
        TriviaGame game = new TriviaGame();
        Scanner input = new Scanner(System.in);
        game.fileRead("spaceTrivia.txt");


        System.out.println("Welcome to the Trivia Game!");
        System.out.println("Are you ready to start?(y/n)");
        if(input.nextLine().equals("y")){
            game.askQuestion();

        }
    }
}

