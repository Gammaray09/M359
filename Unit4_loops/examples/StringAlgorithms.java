package Unit4_loops.examples;

public class StringAlgorithms {
    public static void main(String[] args) {

        // PART I
        String mySchool = "Fremd Vikings";

        // print every other character of mySchool on the same line
        for(int i =0; i < mySchool.length(); i+= 2){
            System.out.print(mySchool.substring(i, i+1) + " ");
        }

        System.out.println("");
        // print the String mySchool in reverse (all characters on the same line)
        for(int i =mySchool.length(); i > 0; i--){
            System.out.print(mySchool.substring(i-1, i));
        }




         /* PART II
           Given the String animal, print the output such that the first line shows
           the first character, the second line shows the second character, and so on

           Ex:  If animal = "monkey" then the output would be:
               m
               mo
               mon
               monk
               monke
               monkey
        */
        System.out.println("");
        String animal = "monkey";
        for(int i =0; i < animal.length(); i++){
            System.out.println(animal.substring(0, i));
        }





        // PART III
        String phrase = "Mary had a little lamb, little lamb, little lamb";
        phrase += "Mary had a little lamb, its fleece was white as snow";

        // Print the amount of times the word "little" appears within phrase?
        int numWord = 0;
        boolean isDone = false;
        while(!isDone){
            int index = phrase.indexOf("little");

            if(index == -1){
                isDone = true;
            } else {
               numWord++;
               phrase = phrase.substring(index + 6);
            }
        }
        System.out.println(numWord);


        // create a new String, or modify the existing String, that removes
        // the word "little" entirely
        phrase = "Mary had a little lamb, little lamb, little lamb";
        phrase += " Mary had a little lamb, its fleece was white as snow";
        boolean isDone1 = false;
        while(!isDone1){
            int index = phrase.indexOf("little");

            if(index == -1){
                isDone1 = true;
            } else {
                numWord++;
                phrase = phrase.substring(0, index-1) + phrase.substring(index + 6) ;
            }
        }
        System.out.println(phrase);



        // create a new String (based on phrase), or modify the existing String,
        // that replaces the word "little" with the word "BIG"

        phrase = "Mary had a little lamb, little lamb, little lamb";
        phrase += " Mary had a little lamb, its fleece was white as snow";
        boolean isDone2 = false;
        while(!isDone2){
            int index = phrase.indexOf("little");

            if(index == -1){
                isDone2 = true;
            } else {
                numWord++;
                phrase = phrase.substring(0, index-1) + " BIG" + phrase.substring(index + 6) ;
            }
        }
        System.out.println(phrase);


    }
}
