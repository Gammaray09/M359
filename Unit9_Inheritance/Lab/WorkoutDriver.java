package Unit9_Inheritance.Lab;

import java.util.Scanner;

public class WorkoutDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        printLogo();
        System.out.println("Welcome to Workout planner!");
        System.out.print("How many weeks do you want to workout for? ");
        int weeks = input.nextInt();
        input.nextLine();

        WorkoutPlan workoutSchedule = new WorkoutPlan(weeks);
        workoutSchedule.createPlan();
        System.out.println(workoutSchedule);

        Boolean endProgram = true;
        while (endProgram){
            System.out.print("Ready to start a workout week? ");
            String userInput = input.nextLine();
            if(userInput.equalsIgnoreCase("yes")){
                workoutSchedule.workoutNextWeek();
                workoutSchedule.printProgress();
            }else{
                break;
            }
        }

    }







    public static void printLogo(){
        System.out.println(" _       __              __                  __ \n" +
                "| |     / /____   _____ / /__ ____   __  __ / /_\n" +
                "| | /| / // __ \\ / ___// //_// __ \\ / / / // __/\n" +
                "| |/ |/ // /_/ // /   / ,<  / /_/ // /_/ // /_  \n" +
                "|__/|__/ \\____//_/   /_/|_| \\____/ \\__,_/ \\__/  \n" +
                "    ____   __                                   \n" +
                "   / __ \\ / /____ _ ____   ____   ___   _____   \n" +
                "  / /_/ // // __ `// __ \\ / __ \\ / _ \\ / ___/   \n" +
                " / ____// // /_/ // / / // / / //  __// /       \n" +
                "/_/    /_/ \\__,_//_/ /_//_/ /_/ \\___//_/        \n" +
                "                                                ");
    }
}

