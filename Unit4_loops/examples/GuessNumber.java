package Unit4_loops.examples;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int guessedNum = (int)(Math.random() * 10 +1);
        boolean rightAnswer = false;

        while (!rightAnswer){
            System.out.println("Guess a Number:");
            int reply = input.nextInt();
            if (reply == guessedNum){
                System.out.println("You guessed the number " + guessedNum);
                rightAnswer = true;
            } else if(reply >= guessedNum){
                System.out.println("Your guess is too high");
            } else if (reply <= guessedNum){
                System.out.println("Your guess is too low");
            } else {
                System.out.println(" ");
            }
        }
    }
}
