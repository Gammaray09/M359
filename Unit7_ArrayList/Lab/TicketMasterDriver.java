package Unit7_ArrayList.Lab;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TicketMasterDriver {
    public static void main(String[] args) throws FileNotFoundException {
        TicketMaster Tickets = new TicketMaster();
        Scanner input = new Scanner(System.in);

        Tickets.fileRead("showData.txt");
        Tickets.printData();

        int userInput = 0;
        while (userInput != 6){
            System.out.println("Performer:(A-Z)[1] or (Z-A)[2] | Price:(L-H)[3] or (H-L)[4] | City[5] | Quit[6]");
            userInput = input.nextInt();

            if (userInput == 5){
                //System.out.print("What city are you looking for? ");
                //String cityInput = input.nextLine();
                Tickets.searchCity("Palatine");
            }
        }
    }
}
