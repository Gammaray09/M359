package PersonalProjects.Wordscapes;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class formater {
    public static void main(String[] args) throws FileNotFoundException {
        File words = new File("words_alpha.txt");
        Scanner scnr = new Scanner(words);

        try {
            File formattedWords = new File("formattedWords.txt");

            if (formattedWords.createNewFile()) {
                System.out.println("File created: " + formattedWords.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }



        /*while(scnr.hasNextLine()){
            String curString = scnr.nextLine();
            if(curString.length() < 7){
                try{
                    FileWriter myWriter = new FileWriter("formattedWords.txt");
                    myWriter.write(curString + "\n");
                    System.out.println("Successfully wrote to the file.");
                    myWriter.close();
                }catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
            }

        }*/
        try{
            FileWriter myWriter = new FileWriter("formattedWords.txt");

            for (int i = 0; i < 5; i++) {
                String curString = scnr.nextLine();
                if(curString.length() < 7){
                        myWriter.write("Files in Java might be tricky, but it is fun enough!\n");
                        System.out.println("Successfully wrote to the file.");
                    }
                }
        }catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

}
