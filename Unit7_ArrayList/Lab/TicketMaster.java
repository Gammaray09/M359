package Unit7_ArrayList.Lab;

import Unit6_Arrays.Homework.Trivia.Question;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TicketMaster {
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String RESET = "\033[0m";  // Text Reset

    private ArrayList<Show> showsList;

    public TicketMaster() {
        showsList = new ArrayList<Show>();;
    }

    public void fileRead(String filename) throws FileNotFoundException {

        File myFile = new File(filename);
        Scanner fileIn = new Scanner(myFile);

        while (fileIn.hasNextLine()){
            String date = fileIn.next();
            double price = fileIn.nextDouble();;
            int quantity = fileIn.nextInt();
            String temp = fileIn.nextLine();
            String name = temp.substring(0, temp.indexOf(","));
            String location = temp.substring(temp.indexOf(",")+2);

            Show newShow = new Show(date,price,quantity,name,location);
            showsList.add(newShow);
        }
    }


    public void printData(){
        System.out.println(GREEN + "Date\t\tPrice\t\tQty\t\t Performer\t\t\tCity");
        System.out.println("-------------------------------------------------------------" + RESET);
        for(Show s: showsList){
            System.out.println(s);
        }
        System.out.println(GREEN + "-------------------------------------------------------------"+ RESET );
    }

    public void lowToHighPrice(){

    }

    public void highToLowPrice(){

    }

    public void searchCity(String city){
        city = city.toLowerCase();
        System.out.println(GREEN + "Date\t\tPrice\t\tQty\t\t Performer\t\t\tCity");
        System.out.println("-------------------------------------------------------------" + RESET);
        for(Show s: showsList) {
            if (s.getLocation().toLowerCase().equals(city)){
                System.out.println(s);
            }
        }
        System.out.println(GREEN + "-------------------------------------------------------------"+ RESET );
    }
}
