package Unit4_loops.examples;

import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isDone = false;
        int totalScore = 0;
        int numScore = 0;

        while(!isDone){
            System.out.println("Do you have a score to enter?");
            String reply = input.nextLine();

            if(reply.equalsIgnoreCase("y")){
                System.out.println("Type your score:");
                int newScore = input.nextInt();
                totalScore += newScore;
                numScore++;
                input.nextLine();
            } else {
                isDone = true;
            }
        }

        System.out.println("Average Score: " + (double)totalScore/numScore);
        System.out.println("Total Score: " + totalScore);
    }
}
