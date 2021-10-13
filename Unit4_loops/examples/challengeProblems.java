package Unit4_loops.examples;

public class challengeProblems {
    public static void everyOtherLetterPyramid(String str){
        String orgString = str;

        while (orgString.length() > 1) {
            String newStr = "";
            for (int i = 0; i < orgString.length(); i += 2) {
                newStr += orgString.substring(i, i + 1);
            }

            System.out.println(newStr);
            orgString = newStr;
        }
    }


    public static void main(String[] args) {
        //challenge 1
        for (int i = 6; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }

        //challenge 2
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }

        //challenge 3
        System.out.println();
        everyOtherLetterPyramid("FremdVikings");



    }
}
