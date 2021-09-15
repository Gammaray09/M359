package Unit2_UsingObjects.Homework.WS1;

public class Fruit {
    // instance variables
    private String name;
    private boolean ripe;
    private int servings;

    //constructors
    public Fruit(String aName, boolean isRipe){
        name = aName;
        ripe = isRipe;
        servings = 1; //default value is 1
    }


    //methods
    public void printInfo(){
        // print the name
        System.out.println("Name: "+ name);
        // print the ripe status
        System.out.println("Ripeness:" + ripe);
        // print number of servings
        System.out.println("Servings:" + servings);
        System.out.println();
    }


    public int getServings(){
        return servings;
    }
}
