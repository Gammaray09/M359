package Unit2_UsingObjects.Examples.cars;

public class Car {
    // instance variables
    private int modelYear;
    private String name;


    // write getters and setters of model year and name (methods)
    public int getModelYear(){
        return modelYear;
    }
    public void setModelYear(int my){
        modelYear = my;
    }
    public String getName(){
        return name;
    }
    public void setName(String nm){
        name = nm;
    }


    // constructors
    public Car(String aName, int aModelYear){
        modelYear = aModelYear;
        name = aName;
    }
    public Car(String aName){
        modelYear = 2021; //defaults value 2021
        name = aName;
    }


    //methods
    public void printInfo(){
        System.out.println("Model: " + name);
        System.out.println(("Model Year: " + modelYear));
    }
}
