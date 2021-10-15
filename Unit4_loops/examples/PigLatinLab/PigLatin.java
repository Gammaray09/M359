package Unit4_loops.examples.PigLatinLab;

import java.util.Locale;

public class PigLatin {

    public static String toPigLatin(String phrase){
        int index = 0;
        String tempPhrase = phrase;
        String translatedPhrase = "";
        String aWord = "";
        while(index != -1){
            index = tempPhrase.indexOf(" ");
            aWord = tempPhrase.substring(0,index);
            tempPhrase = tempPhrase.substring(index);
            translatedPhrase += aWord + " ";
        }
        return translatedPhrase;
    }

    public static String translateWordToPigLatin(String str){
        String translatedWord = "";
        if (vowelCheck(str.substring(0,1)) == true) {
            translatedWord = str + "yay";
        } else if(vowelCheck(str.substring(0,1)) == false && vowelCheck(str.substring(1,2)) == false){
            String twoLetters = str.substring(0,2);
            translatedWord = str.substring(2) + twoLetters + "ay";
        } else {
            String firstLetter = str.substring(0,1);
            translatedWord = str.substring(1) + firstLetter + "ay";
        }
        return translatedWord;
    }


    public static boolean vowelCheck(String word){
        word = word.toLowerCase(Locale.ROOT);
        if(word.equals("a")){
            return true;
        } else if(word.equals("e")){
            return true;
        } else if(word.equals("i")){
            return true;
        } else if(word.equals("o")){
            return true;
        } else if(word.equals("u")){
            return true;
        } else{
            return false;
        }
    }

}
