package Unit9_Inheritance.Lab;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WorkoutDriver {
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String RESET = "\033[0m";  // Text Reset

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        printLogo();
        System.out.println("Welcome to Workout planner!");
        int weeks = 0;
        boolean tryAgain = true;
        while (tryAgain){
            try {
                System.out.print("How many weeks do you want to workout for? ");
                weeks = input.nextInt();
                tryAgain = false;
            } catch (InputMismatchException e){
                System.out.println("\nTry again, please type in a valid integer");
            }
            input.nextLine();
        }



        WorkoutPlan workoutSchedule = new WorkoutPlan(weeks);
        workoutSchedule.createPlan();
        System.out.println(workoutSchedule);

        Boolean endProgram = true;
        while (endProgram){
            try {

                tryAgain = true;
                while (tryAgain){
                    try {
                        System.out.print("Ready to start a workout week? ");
                        String userInput = input.nextLine();
                        if(userInput.equalsIgnoreCase("yes")){
                            workoutSchedule.workoutNextWeek();
                            workoutSchedule.printProgress();
                        }else if(userInput.equalsIgnoreCase("no")){
                            break;
                        }else {
                            throw new InputMismatchException();
                        }
                        tryAgain = false;
                    }catch (InputMismatchException e){
                        System.out.println("\nTry Again,please type yes or no");
                    }
                }

            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Workout is done!");
                break;
            }
        }

    }







    public static void printLogo(){
        System.out.println(PURPLE + " _       __              __                  __ \n" +
                "| |     / /____   _____ / /__ ____   __  __ / /_\n" +
                "| | /| / // __ \\ / ___// //_// __ \\ / / / // __/\n" +
                "| |/ |/ // /_/ // /   / ,<  / /_/ // /_/ // /_  \n" +
                "|__/|__/ \\____//_/   /_/|_| \\____/ \\__,_/ \\__/  \n" +
                "    ____   __                                   \n" +
                "   / __ \\ / /____ _ ____   ____   ___   _____   \n" +
                "  / /_/ // // __ `// __ \\ / __ \\ / _ \\ / ___/   \n" +
                " / ____// // /_/ // / / // / / //  __// /       \n" +
                "/_/    /_/ \\__,_//_/ /_//_/ /_/ \\___//_/        \n" +
                "                                                " + RESET);
    }
}

