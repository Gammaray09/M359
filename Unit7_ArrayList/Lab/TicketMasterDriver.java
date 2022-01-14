package Unit7_ArrayList.Lab;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TicketMasterDriver {
    public static void main(String[] args) throws FileNotFoundException {
        TicketMaster Tickets = new TicketMaster();

        Tickets.fileRead("showData.txt");
        Tickets.printData();
    }
}
