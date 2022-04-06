package PersonalProjects.Wordscapes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordScapeSolver {
    //final variables
    public static final int filterNum = 3;
    public static final String BOXING = "\033[0;51m";   // BLACK
    public static final String RESET = "\033[0m";  // Text Reset

    public static void main(String[] args) throws FileNotFoundException{
        // creates array for dictionary
        ArrayList<String> dictionary = new ArrayList<>();

        //opens scanner and file
        File words = new File("words_alpha.txt");
        Scanner scnr = new Scanner(words);


        //adds all words to dictionary
        while(scnr.hasNextLine()){
            String curword = scnr.nextLine();
            dictionary.add(curword);
        }

        //letter input
        String letters = "backed";

        //sorter function call
        solver(dictionary,"",letters);
    }


    public static void solver(ArrayList<String> wordArray, String root, String l){
        //base case
        if(l.length() == 0){
            //if word is within filter length
            if(root.length() > filterNum - 1 && root.length() <= filterNum ){
                //searches for word in array
                int position = binarySearch(wordArray,0, wordArray.size(), root);
                if(position != -1){
                    System.out.println(BOXING + wordArray.get(position) + RESET);
                }
            }
        }

        //recursive loop
        for (int i = 0; i < l.length(); i++) {
            //if word is within filter length
            if(root.length() > filterNum - 1 && root.length() <= filterNum){
                //searches for word in array
                int position = binarySearch(wordArray,0, wordArray.size(), root);
                if(position != -1){
                    System.out.println(wordArray.get(position));
                }
            }
            solver(wordArray,root + l.charAt(i), l.substring(0, i) + l.substring(i + 1));
        }

    }




    public static int binarySearch(ArrayList<String> wordArray, int lowPosition, int highPosition, String target){
        int midPosition;

        if(lowPosition > highPosition){
            return -1;
        }else{
            midPosition = (lowPosition + highPosition)/2;
            if(wordArray.get(midPosition).compareToIgnoreCase(target) < 0){
                return binarySearch(wordArray, midPosition + 1,  highPosition,  target);
            }
            if(wordArray.get(midPosition).compareToIgnoreCase(target) > 0){
                return binarySearch(wordArray,  lowPosition,  midPosition -1,  target);
            }
            return midPosition;
        }
    }
}
