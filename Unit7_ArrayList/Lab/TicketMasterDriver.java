package Unit7_ArrayList.Lab;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TicketMasterDriver {
    // static variables for text colors
    private static final String RED_BRIGHT = "\033[0;91m";    // RED
    private static final String GREEN_BRIGHT = "\033[0;92m";  // GREEN
    private static final String RESET = "\033[0m";  // Text Reset
    private static final String BOXING = "\033[0;51m";   // BLACK

    //static variables for what method needs to be called
    private static final int AZSort = 1;
    private static final int ZASort = 2;
    private static final int HLSort = 3;
    private static final int LHSort = 4;
    private static final int CITYSEARCH = 5;
    private static final int QUIT = 6;

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
            Tickets.printMenu();

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
                    // dummy read
                    input.nextLine();

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

            // if user types 1 to sort by name A-Z
            if (userInput == AZSort) {
                //gets nano second time
                long nano_startTime = System.nanoTime();
                Tickets.performerSortAZ();
                long nano_endTime = System.nanoTime();
                // prints out time taken to process
                System.out.println(BOXING +" Time taken to sort: " + (nano_endTime - nano_startTime)+" nanoseconds"+ RESET);

            }

            // if user types 2 to sort by name Z-A
            if (userInput == ZASort) {
                long nano_startTime = System.nanoTime();
                Tickets.performerSortZA();
                long nano_endTime = System.nanoTime();
                System.out.println(BOXING +" Time taken to sort: " + (nano_endTime - nano_startTime)+" nanoseconds"+ RESET);
            }

            // if user types 3 to sort by price low to high
            if (userInput == LHSort) {
                long nano_startTime = System.nanoTime();
                Tickets.lowToHighPrice();
                long nano_endTime = System.nanoTime();
                System.out.println(BOXING +" Time taken to sort: " + (nano_endTime - nano_startTime) +" nanoseconds"+ RESET);
            }

            // if user types 4 to sort by price high to low
            if (userInput == HLSort) {
                long nano_startTime = System.nanoTime();
                Tickets.highToLowPrice();
                long nano_endTime = System.nanoTime();
                System.out.println(BOXING +" Time taken to sort: " + (nano_endTime - nano_startTime)+" nanoseconds"+ RESET);
            }

            //if user selects 5 to sort by city
            if (userInput == CITYSEARCH ) {
                tryAgain = true;
                String cityInput = "";
                while (tryAgain) {
                    try {
                        System.out.print("What city are you looking for: ");
                        cityInput = input.nextLine();
                        tryAgain = false;
                    } catch (Exception e) {
                        System.out.println(RED_BRIGHT + "Invalid Input, Input a valid city" + RESET);
                        input.nextLine();
                    }
                }
                long nano_startTime = System.nanoTime();
                Tickets.searchCity(cityInput.toLowerCase());
                long nano_endTime = System.nanoTime();
                System.out.println(BOXING + " Time taken to sort: " + (nano_endTime - nano_startTime)+" nanoseconds"+ RESET);
            }

            // if user selects 6 to quit
            if(userInput == QUIT){
                System.out.println("Thanks for using TicketMaster!");
                break;
            }
        }
    }
}
