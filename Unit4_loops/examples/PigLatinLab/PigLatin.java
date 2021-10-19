package Unit4_loops.examples.PigLatinLab;

import java.util.Locale;

public class PigLatin {
    // This method separates each word in the phrase and calls the translatedWordToPigLatin it
    // Then it returns the translated phrase
    public static String toPigLatin(String phrase){
        int index = 0;
        String tempPhrase = phrase.toLowerCase();
        String translatedPhrase = "";
        String aWord = "";
        // while loop keeps looping until theres is no spaces
        while(tempPhrase.indexOf(" ") != -1) {
            index = tempPhrase.indexOf(" ");
            // grabs singular word
            aWord = tempPhrase.substring(0, index);
            tempPhrase = tempPhrase.substring(index + 1);
            if(aWord.length() != 0) {
                // calls translateWordToPigLatin method to grabbed word and adds it to translation
                translatedPhrase += translateWordToPigLatin(aWord) + " ";
            } else {
                break;
            }

        }
        // translates last word because there are no spaces left
        translatedPhrase += translateWordToPigLatin(tempPhrase) + " ";
        // changes fist letter to a capital letter
        String capitalLetter = translatedPhrase.substring(0,1).toUpperCase();
        translatedPhrase = capitalLetter + translatedPhrase.substring(1);;
        return translatedPhrase;
    }

    //This method takes in a string parameter and translates that string into piglatin
    // This method knows how to translate it by calling the vowelCheck method
    // Finally, this method returns the translated word
    public static String translateWordToPigLatin(String str){
        String translatedWord = "";
        // check if str starts with a vowel or constants
        if (vowelCheck(str.substring(0,1)) == true) {
            // word starts with vowel
            translatedWord = str + "yay";
        } else if(vowelCheck(str.substring(0,1)) == false && vowelCheck(str.substring(1,2)) == false){
            // word starts with exactly 2 consonants
            String twoLetters = str.substring(0,2);
            // brings first two letters to back and adds ay
            translatedWord = str.substring(2) + twoLetters + "ay";
        } else {
            // word starts with exactly 1 consonants
            String firstLetter = str.substring(0,1);
            // brings first letter to back and adds ay
            translatedWord = str.substring(1) + firstLetter + "ay";
        }
        return translatedWord;
    }


    // This method is called by the translateWordToPigLatin method and takes in a string parameter
    // This method checks if the string starts with a vowel and returns a boolean based on that
    public static boolean vowelCheck(String word){
        //sets word to all lower case
        word = word.toLowerCase(Locale.ROOT);
        // checks if words starts with aeiou and return boolean
        if(word.equals("a")){
            // word starts with a
            return true;
        } else if(word.equals("e")){
            // word starts with e
            return true;
        } else if(word.equals("i")){
            // word starts with i
            return true;
        } else if(word.equals("o")){
            // word starts with o
            return true;
        } else if(word.equals("u")){
            // word starts with u
            return true;
        } else{
            // word doesn't start with a vowel
            return false;
        }
    }

}
