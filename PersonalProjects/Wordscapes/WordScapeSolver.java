package PersonalProjects.Wordscapes;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Array;
import java.util.Scanner;

public class WordScapeSolver {

    public static void main(String[] args) throws FileNotFoundException{
        String[] arr= new Array();
        File words = new File("words_alpha.txt");
        Scanner scnr = new Scanner(words);

        while(scnr.hasNextLine()){
            String curword = scnr.nextLine();

            if(curword.equalsIgnoreCase(word)){
                exist = true;
                break;
            }
        }

        String letters = "epsru";
        solver("",letters);
    }


    public static void solver(String root, String l)throws FileNotFoundException{
        if(l.length() == 0){
            if(checkWord(root) == true && root.length() > 3){
                System.out.println(root);
            }
        }
        for (int i = 0; i < l.length(); i++) {
            if(checkWord(root) == true && root.length() > 3){
                System.out.println(root);
            }
            solver(root + l.charAt(i), l.substring(0, i) + l.substring(i + 1));
        }

    }

    public static boolean checkWord(String word) throws FileNotFoundException {
        File words = new File("words_alpha.txt");
        Scanner scnr = new Scanner(words);


        boolean exist = false;

        while(scnr.hasNextLine()){
            String curword = scnr.nextLine();

            if(curword.equalsIgnoreCase(word)){
                exist = true;
                break;
            }
        }
        return exist;
    }


    public static void binarySearch() throws FileNotFoundException{
    }
}
