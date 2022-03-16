package Unit9_Inheritance.Lab;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WorkoutDriver {
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String RESET = "\033[0m";  // Text Reset
    public static final String GREEN_BRIGHT = "\033[0;92m";  // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        printLogo();
        System.out.println(GREEN_BRIGHT + "Welcome to you customized workout planner!");
        int weeks = 0;
        boolean tryAgain = true;
        //Keeps asking user how many weeks until valid integer has been inputted
        while (tryAgain){
            try {
                System.out.print("How many weeks do you want to workout for? ");
                weeks = input.nextInt();
                tryAgain = false;
            // user did not put in valid integer
            } catch (InputMismatchException e){
                System.out.println("\nTry again, please type in a valid integer");
            }
            //dummy read
            input.nextLine();
        }


        System.out.println("\n\nYour workout plan has been created. Lets do this!" + RESET + "\n");
        //creates WorkoutPlan object
        WorkoutPlan workoutSchedule = new WorkoutPlan(weeks);
        // creates plan for workoutSchedule object
        workoutSchedule.createPlan();
        //Prints out schedule
        System.out.println(workoutSchedule);


        //Puts user in a while loop until all weeks have been finished
        while (true){
            try {

                tryAgain = true;
                //Puts user in a while loop until a valid input has been inputted
                while (tryAgain){
                    try {
                        System.out.print(GREEN_BRIGHT+"Ready to start a workout week?(yes/no) " +RESET);
                        String userInput = input.nextLine();
                        if(userInput.equalsIgnoreCase("yes")){
                            //Calculated data for next week
                            workoutSchedule.workoutNextWeek();
                            System.out.println(YELLOW_BRIGHT + "\n*** CURRENT PROGRESS ***" + RESET);
                            //prints progress
                            workoutSchedule.printProgress();
                        }else if(userInput.equalsIgnoreCase("no")){
                            System.out.println(GREEN_BRIGHT+ "Not Ready? Don't worry you got this!" + RESET);
                        }else {
                            //user did not type a valid input
                            throw new InputMismatchException();
                        }
                        tryAgain = false;
                    }catch (InputMismatchException e){
                        System.out.println(GREEN_BRIGHT+"\nTry Again,please type yes or no"+RESET);
                    }
                }

            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println(YELLOW_BRIGHT + "*** FINAL PROGRESS ***" + RESET);
                workoutSchedule.printProgress();
                System.out.println(GREEN_BRIGHT+"Thank you for using Workout Planner" + RESET);
                break;
            }
        }

    }


    /**
     * Prints the intro logo for the program
     */
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

