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
        ArrayList<String> possibleWords = new ArrayList<>();

        //opens scanner and file
        File words = new File("words_alpha.txt");
        Scanner scnr = new Scanner(words);


        //adds all words to dictionary
        while(scnr.hasNextLine()){
            String curword = scnr.nextLine();
            dictionary.add(curword);
        }

        //letter input
        String letters = "budot";

        //sorter function call
        solver(dictionary,possibleWords,"",letters);
    }


    public static void solver(ArrayList<String> dictionary, ArrayList<String> wordArray, String root, String l){
        //base case
        if(l.length() == 0){
            //if word is within filter length
            if(root.length() > filterNum - 1 && root.length() <= filterNum ){
                //searches for word in array
                int position = binarySearch(dictionary,0, dictionary.size(), root);

                if(position != -1){
                    if(!checkWord(wordArray,dictionary.get(position))){
                        System.out.println(dictionary.get(position));
                    }
                }
            }
        }

        //recursive loop
        for (int i = 0; i < l.length(); i++) {
            //if word is within filter length
            if(root.length() > filterNum - 1 && root.length() <= filterNum){
                //searches for word in array
                int position = binarySearch(dictionary,0, dictionary.size(), root);

                if(position != -1){
                    if(checkWord(wordArray,dictionary.get(position))){
                        System.out.println( dictionary.get(position));
                    }
                }
            }
            solver(dictionary, wordArray,root + l.charAt(i), l.substring(0, i) + l.substring(i + 1));
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


    /**
     *
     * @param wordArray
     * @param word
     * @return returns true if word is in array and false if word is not in array
     */
    public static Boolean checkWord(ArrayList<String> wordArray, String word){
        for(String s : wordArray) {
            if(s.equalsIgnoreCase(word)){
                return true;
            }else{
                wordArray.add(word);
            }
        }
        return false;
    }
}
