package Unit7_ArrayList.Lab;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TicketMasterDriver {
    public static final String RED_BRIGHT = "\033[0;91m";    // RED
    public static final String GREEN_BRIGHT = "\033[0;92m";  // GREEN
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String RESET = "\033[0m";  // Text Reset
    public static final String BOXING = "\033[0;51m";   // BLACK

    public static void main(String[] args) throws FileNotFoundException {
        //Creates TicketMaster and Scanner object
        TicketMaster Tickets = new TicketMaster();
        Scanner input = new Scanner(System.in);

        //reads in file and prints data
        Tickets.fileRead("showData.txt");
        Tickets.printData();


        // puts program into an infinite loop until user wants to quit
        while (true) {
            // Asks user to select sorting option
            System.out.println(GREEN_BRIGHT+ "Type an Integer for 1-6 to select an option:" +RESET);
            System.out.println(BLUE + "\tSort By Performer(A-Z)[1]\tSort By Performer(Z-A)[2]\n\tSort By Price(L-H)[3]\t\t" +
                    "Sort By Price(H-L)[4]\n\tCity Search[5]\t\t\t\tQuit[6]" + RESET);

            boolean tryAgain = true;
            int userInput = 0;
            //while loop is not broken until user puts in valid input
            while (tryAgain) {
                try {
                    System.out.print(GREEN_BRIGHT+ "Select an option: " + RESET);
                    userInput = input.nextInt();
                    // Throws error if input is greater than 6 and less than 1
                    if (userInput > 6 || userInput < 1) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    tryAgain = false;
                    // input is out of bounds
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(RED_BRIGHT + "Input out of Bounds, Input an Integer from to 1-6" + RESET);
                    input.nextLine();
                    // input is not valid
                } catch (Exception e) {
                    System.out.println(RED_BRIGHT + "Invalid Input, Input an Integer from to 1-6" + RESET);
                    input.nextLine();
                }
            }

            if (userInput == 1) {
                long nano_startTime = System.nanoTime();
                Tickets.performerSortAZ();
                long nano_endTime = System.nanoTime();
                System.out.println(BOXING +" Time taken to sort: " + (nano_endTime - nano_startTime)+" nano seconds"+ RESET);
            }

            if (userInput == 2) {
                long nano_startTime = System.nanoTime();
                Tickets.performerSortZA();
                long nano_endTime = System.nanoTime();
                System.out.println(BOXING +" Time taken to sort: " + (nano_endTime - nano_startTime)+" nano seconds"+ RESET);
            }

            if (userInput == 3) {
                long nano_startTime = System.nanoTime();
                Tickets.lowToHighPrice();
                long nano_endTime = System.nanoTime();
                System.out.println(BOXING +" Time taken to sort: " + (nano_endTime - nano_startTime) +" nano seconds"+ RESET);
            }

            if (userInput == 4) {
                long nano_startTime = System.nanoTime();
                Tickets.highToLowPrice();
                long nano_endTime = System.nanoTime();
                System.out.println(BOXING +" Time taken to sort: " + (nano_endTime - nano_startTime)+" nano seconds"+ RESET);
            }

            //if user select to sort by city
            if (userInput == 5) {
                tryAgain = true;
                String cityInput = "";
                while (tryAgain) {
                    try {
                        System.out.print("What city are you looking for: ");
                        cityInput = input.next();
                        tryAgain = false;
                    } catch (Exception e) {
                        System.out.println(RED_BRIGHT + "Invalid Input, Input a valid city" + RESET);
                        input.nextLine();
                    }
                }
                long nano_startTime = System.nanoTime();
                Tickets.searchCity(cityInput);
                long nano_endTime = System.nanoTime();
                System.out.println(BOXING + " Time taken to sort: " + (nano_endTime - nano_startTime)+" nano seconds"+ RESET);
            }

            // if user selects to quit
            if(userInput == 6){
                System.out.println("Thanks for using TicketMaster!");
                break;
            }
        }
    }
}
