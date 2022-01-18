package Unit7_ArrayList.Lab;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TicketMasterDriver {
    public static final String RED_BRIGHT = "\033[0;91m";    // RED
    public static final String RESET = "\033[0m";  // Text Reset

    public static void main(String[] args) throws FileNotFoundException {
        TicketMaster Tickets = new TicketMaster();
        Scanner input = new Scanner(System.in);

        Tickets.fileRead("showData.txt");
        Tickets.printData();

        System.out.println("Type an Integer for 1-6 to select an option:");
        System.out.println("\tSort By Performer(A-Z)[1]\tSort By Performer(Z-A)[2]\n\tSort By Price(L-H)[3]\t    " +
                "Sort By Price(H-L)[4]\n\tCity Search[5]\t\t\t\tQuit[6]");

        boolean tryAgain = true;
        int userInput = 0;
        while (tryAgain){
            try {
                System.out.print("Select an option: ");
                userInput = input.nextInt();
                tryAgain = false;
            } catch (Exception e){
                System.out.println(RED_BRIGHT + "Invalid Input, Input an Integer from to 1-6" + RESET);
                input.nextLine();
            }
        }
    }
}
