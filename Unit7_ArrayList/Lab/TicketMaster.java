package Unit7_ArrayList.Lab;

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
        for (int i = 1; i < showsList.size(); i++) {
            Show temp = showsList.get(i);
            int position = i - 1;
            while (position >= 0){
                if(showsList.get(i).getPrice() > temp.getPrice()){
                    showsList.set(i, showsList.get(position));
                    showsList.set(position, temp);
                }
                position -= 1;
            }
        }
        printData();
    }

    public void highToLowPrice(){


    }



    public void performerSortAZ(){
        for (int i = 0; i < showsList.size()-1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < showsList.size(); j++) {
                if(showsList.get(j).getName().compareToIgnoreCase(showsList.get(minIndex).getName()) < 0){
                    minIndex = j;
                }
            }
            Show minIndexObj = showsList.get(minIndex);
            showsList.set(minIndex, showsList.get(i));
            showsList.set(i, minIndexObj);
        }
        printData();
    }

    public void performerSortZA(){
        for (int i = 0; i < showsList.size()-1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < showsList.size(); j++) {
                if(showsList.get(j).getName().compareToIgnoreCase(showsList.get(minIndex).getName()) > 0){
                    minIndex = j;
                }
            }
            Show minIndexObj = showsList.get(minIndex);
            showsList.set(minIndex, showsList.get(i));
            showsList.set(i, minIndexObj);
        }
        printData();
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
