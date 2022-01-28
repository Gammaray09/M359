package Unit7_ArrayList.Lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TicketMaster {

    // constant variable for colors
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String RESET = "\033[0m";  // Text Reset
    private static final String RED_BRIGHT = "\033[0;91m";    // RED
    private static final String GREEN_BRIGHT = "\033[0;92m";  // GREEN
    public static final String BLUE = "\033[0;34m";    // BLUE

    private ArrayList<Show> showsList;

    //instantiates the showList arr
    public TicketMaster() {
        showsList = new ArrayList<Show>();
    }

    public void fileRead(String filename) throws FileNotFoundException {
        File myFile = new File(filename);
        Scanner fileIn = new Scanner(myFile);

        while (fileIn.hasNextLine()){
            String date = fileIn.next();
            double price = fileIn.nextDouble();
            int quantity = fileIn.nextInt();
            String temp = fileIn.nextLine();
            String name = temp.substring(0, temp.indexOf(","));
            String location = temp.substring(temp.indexOf(",")+2);

            Show newShow = new Show(date,price,quantity,name,location);
            showsList.add(newShow);
        }
    }

    /**
     * This function prints out a header the iterates through the array
     * printing out each object
00000000
















     */
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
            int position = i;
            while (position > 0 && (showsList.get(position-1).getPrice() > temp.getPrice())){
                showsList.set(position, showsList.get(position-1));
                position -= 1;
            }
            showsList.set(position,temp);
        }
        printData();
    }

    public void highToLowPrice(){

        for (int i = 1; i < showsList.size(); i++) {
            Show temp = showsList.get(i);
            int position = i;
            while (position > 0 && (showsList.get(position-1).getPrice() < temp.getPrice())){
                showsList.set(position, showsList.get(position-1));

                position -= 1;
            }
            showsList.set(position,temp);
        }
        printData();
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

    /**
     * This function takes in a string and iterates through the array twice
     * The first time is checks if the string is located as a city in the array
     * If the string exist then the function iterates through the array again and
     * prints out the objects that contain that string as a city.
     * If the string does not exist the program prints out that it did not find the city
     *
     * @param city a string of what city the user is looking for
     */
    public void searchCity(String city){
        int count = 0;
        city = city.toLowerCase();
        System.out.println(GREEN + "Date\t\tPrice\t\tQty\t\t Performer\t\t\tCity");
        System.out.println("-------------------------------------------------------------" + RESET);
        for(Show s: showsList) {
            if (s.getLocation().toLowerCase().equals(city)){
                count++;
            }
        }
        if(count > 0){
            for(Show s: showsList) {
                if (s.getLocation().toLowerCase().equals(city)){
                    System.out.println(s);
                }
            }
        }else{
            System.out.println(RED_BRIGHT+"\t\t\t\t\t**No Cities Found**");
        }
        System.out.println(GREEN + "-------------------------------------------------------------"+ RESET );
    }


    /**
     * This function prints out menu in clean format so
     * user can select an option
     */
    public void printMenu(){
        System.out.println(GREEN_BRIGHT+ "Type an Integer for 1-6 to select an option:" +RESET);
        System.out.println(BLUE + "\tSort By Performer(A-Z)[1]\tSort By Performer(Z-A)[2]\n\tSort By Price(L-H)[3]\t\t" +
                "Sort By Price(H-L)[4]\n\tCity Search[5]\t\t\t\tQuit[6]" + RESET);
    }
}
