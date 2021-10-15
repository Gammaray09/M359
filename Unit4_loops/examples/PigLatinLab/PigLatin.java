package Unit4_loops.examples.PigLatinLab;

public class PigLatin {
    //public static String toPigLatin(String phrase){

    //}

    public static String translateWordToPigLatin(String str){
        String translatedWord = "";
        if (vowelCheck(str) == true){
            translatedWord = str + "yay";
        } else {
            String firstLetter = str.substring(0,1);
            translatedWord = str.substring(1) + firstLetter + "ay";
        }
        return translatedWord;
    }


    public static boolean vowelCheck(String word){
        if(word.substring(0,1).equals("a")){
            return true;
        } else if(word.substring(0,1).equals("e")){
            return true;
        } else if(word.substring(0,1).equals("i")){
            return true;
        } else if(word.substring(0,1).equals("o")){
            return true;
        } else if(word.substring(0,1).equals("u")){
            return true;
        } else{
            return false;
        }
    }
}
