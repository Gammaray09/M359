package Unit2_UsingObjects.Quiz;

public class Quiz
{

    // *** WRITE CODE HERE ***
    // Part A
    // Create instance variables for the quiz name, number of MC's,
    // and extra credit status
    private String quizName;
    private int multipleChoice;
    private boolean extraCredit;

    // *** WRITE CODE HERE ***
    // Part B
    // Create a default Quiz constructor that sets the name
    // to "M359 Pop Quiz", has 3 MC's, and offers no extra credit
    public Quiz(){
        quizName = "M359 Pop Quiz";
        multipleChoice = 3;
    }

    // *** WRITE CODE HERE ***
    // Part C
    // Create a full Quiz constructor that accepts each instance
    // variable as a parameter
    public Quiz(String quiz, int mc, boolean aExtraCredit){
        quizName = quiz;
        multipleChoice = mc;
        extraCredit = aExtraCredit;
    }

    /*
     / *** WRITE CODE HERE ***
     / Part D
     / Create a printInfo method that prints a nicely formatted
     / summary to the console with the following information:
     /      QUIZ NAME
     /          Number MC's:    #
     /          Has EC:         true/false
     */
    public void printInfo(){
        System.out.println("  " + quizName);
        System.out.println("\t Number MC's:\t" + multipleChoice);
        System.out.println("\t Has EC:\t" + extraCredit);
    }

    // *** WRITE CODE HERE ***
    // Part E
    // Create an addMC method that accepts the number of MC questions
    // you are adding to this quiz as an input parameter, and updates
    // an appropriate instance variable.  This method does not return
    // anything
    public void addMC( int addMC){
        multipleChoice += addMC;
    }

    // *** WRITE CODE HERE ***
    // Part F
    // Create a calcExtraCredit method that returns a random integer
    // between the range of [2,6]
    public int calcExtraCredit(){
        int randomInt = (int)(Math.random() * 5) + 2;
        return  randomInt;
    }


    // *** WRITE CODE HERE ***
    // Part G
    // Create a calcTotal method that accepts the point value for
    // each MC on the quiz and returns the total point value of quiz
    public int calcTotal(int pointValue){
        int total = multipleChoice * pointValue;
        return total;
    }

    // *** WRITE CODE HERE ***
    // Part H
    // Create all getter and setter methods

    public void setExtraCredit(boolean newExtraCredit) {
        extraCredit = newExtraCredit;
    }

    public void setQuizName(String newQuizName) {
        quizName = newQuizName;
    }

    public void setMultipleChoice(int newMultipleChoice) {
        multipleChoice = newMultipleChoice;
    }

    public int getMultipleChoice() {
        return multipleChoice;
    }

    public String getQuizName() {
        return quizName;
    }

    public boolean getExtraCredit() {
        return extraCredit;
    }

    // *** EXTRA CREDIT ***
    // Create a method named returnLastName that accepts a single parameter
    // (in the form of "FirstName LastName") and returns only the last name
    // Ex:  returnLastName("Mark Langer") would return "Langer"
    public String returnLastName(String name){
        String space = " ";
        int indexSpace = name.indexOf(space);
        String lastName = name.substring(indexSpace);
        return lastName;
    }

}
