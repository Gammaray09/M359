package Unit4_loops.examples;

public class For_loops {
    public static void main(String[] args) {
        // print even number from 0 to 20
        for (int i = 0; i < 21; i+= 2){
            System.out.print(i + " ");
        }
        System.out.println("");

        // print multiple of 5 from 5 to 100
        for (int i = 5; i < 100; i+= 5){
            System.out.print(i + " ");
        }
        System.out.println("");

        //print every character of a String with a space between them
        String str = "cookie";
        for (int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println("");

        //print every character of a String in reverse order
        String str1 = "cookie";
        for (int i = str1.length(); i > 0; i--){
            System.out.print(str1.charAt(i-1));
        }
    }
}
