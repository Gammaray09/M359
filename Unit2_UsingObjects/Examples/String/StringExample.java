package Unit2_UsingObjects.Examples.String;

public class StringExample {
    public static void main(String[] args) {
        String s1 = "Vacation";
        String s2 = "Sunshine cures all things";
        // .toUpperCase make the string all caps
        System.out.println(s1.toUpperCase());
        // .toUpperCase does not change s1
        System.out.println(s1);


        //s2 has a "u" in it so it returns a 1
        System.out.println(s2.indexOf("u"));
        // s2 does not have a x so -1 is returned
        System.out.println(s2.indexOf("x"));

        // .subString(4) returns all the letter after the fourth letter
        // .subString(2,5) returns all the letters between the two letters
        System.out.println(s1.substring(4));
        System.out.println(s1.substring(2, 5));

        // returns the amount of letters in the word
        System.out.println(s1.length());
        System.out.println(s2.length());


        // .equals checks if s1 is equal to VACATION and returns a boolean value
        boolean isEqual = s1.equals("VACATION");
        System.out.println(isEqual);
        // .equals checks if s1 is equal to vacation and returns a boolean value
        isEqual = s1.equals("Vacation");
        System.out.println(isEqual);
        // .equals checks if all caps s1 is equal to VACATION and returns a boolean value
        isEqual = s1.toUpperCase().equals("VACATION");
        System.out.println(isEqual);

        // if the number is a negative than means the string comes first alphabeticly
        String s3 = "bat";
        String s4 = "bird";
        String s5 = "Mickey";

        System.out.println(s3.compareTo(s4));
        System.out.println(s3.compareTo(s3));
        System.out.println(s4.compareTo(s3));
        System.out.println(s5.compareTo(s3));

        System.out.println("I love " + "M" + "3" + "5" + "9");
        System.out.println("I love " + "M" + (3 + 5 + 9));

        System.out.println(24 + 56 + " Days of School");
        System.out.println("Days of School: " + 24 + 56);
    }
}
