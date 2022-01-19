package Unit7_ArrayList.Lab;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TicketMasterDriver {
    public static final String RED_BRIGHT = "\033[0;91m";    // RED
    public static final String RESET = "\033[0m";  // Text Reset

    public static void main(String[] args) throws FileNotFoundException {
        //Creates TicketMaster and Scanner object
        TicketMaster Tickets = new TicketMaster();
        Scanner input = new Scanner(System.in);

        //reads in file and prints data
        Tickets.fileRead("showData.txt");
        Tickets.printData();


        // Asks user to select sorting option
        System.out.println("Type an Integer for 1-6 to select an option:");
        System.out.println("\tSort By Performer(A-Z)[1]\tSort By Performer(Z-A)[2]\n\tSort By Price(L-H)[3]\t    " +
                "Sort By Price(H-L)[4]\n\tCity Search[5]\t\t\t\tQuit[6]");

        boolean tryAgain = true;
        int userInput = 0;
        //while loop is not broken until user puts in valid input
        while (tryAgain){
            try {
                System.out.print("Select an option: ");
                userInput = input.nextInt();
                // Throws error if input is greater than 7 and less than 1
                if (userInput > 7 || userInput < 1) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                tryAgain = false;
            // input is out of bounds
            } catch(ArrayIndexOutOfBoundsException e){
                System.out.println(RED_BRIGHT + "Input out of Bounds, Input an Integer from to 1-6" + RESET);
                input.nextLine();
            // input is not valid
            } catch (Exception e){
                System.out.println(RED_BRIGHT + "Invalid Input, Input an Integer from to 1-6" + RESET);
                input.nextLine();
            }
        }

        //if user select to sort by city
        if(userInput == 5){
            tryAgain = true;
            String cityInput = "";
            while (tryAgain){
                try{
                    System.out.print("What city are you looking for: ");
                    cityInput = input.nextLine();
                    tryAgain = false;
                } catch(Exception e){
                    System.out.println(RED_BRIGHT + "Invalid Input, Input a valid city" + RESET);
                    input.nextLine();
                }
            }
            Tickets.searchCity(cityInput);
        }
    }
}
