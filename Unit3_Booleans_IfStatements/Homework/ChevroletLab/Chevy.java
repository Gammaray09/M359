package Unit3_Booleans_IfStatements.Homework.ChevroletLab;

public class Chevy {
    private int year;
    private int mileage;
    private double fuelEfficiency;
    private int price;
    private String model;
    private String color;
    private boolean luxStatus;
    private boolean a4WDStatus;
    private boolean sportsStatus;

    //constants


    //Constructors
    public Chevy() {
        this.year = 2021;
        this.mileage = 0;
        this.fuelEfficiency = 35;
        this.price = 16000;
        this.model = "Trax";
        this.color = "white";
        this.luxStatus = false;
        this.a4WDStatus = false;
        this.sportsStatus = false;
    }

    public Chevy(int year, int mileage, double fuelEfficiency, int price, String model, String color,
                 boolean luxStatus, boolean a4WDStatus, boolean sportsStatus) {
        this.year = year;
        this.mileage = mileage;
        this.fuelEfficiency = fuelEfficiency;
        this.price = price;
        this.model = model;
        this.color = color;
        this.luxStatus = luxStatus;
        this.a4WDStatus = a4WDStatus;
        this.sportsStatus = sportsStatus;
    }

    //methods

    // Getters and Setters
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
    public int getMileage() { return mileage; }
    public void setMileage(int mileage) { this.mileage = mileage; }
    public double getFuelEfficiency() { return fuelEfficiency; }
    public void setFuelEfficiency(double fuelEfficiency) { this.fuelEfficiency = fuelEfficiency; }
    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public boolean isLuxStatus() { return luxStatus; }
    public void setLuxStatus(boolean luxStatus) { this.luxStatus = luxStatus; }
    public boolean isA4WDStatus() { return a4WDStatus; }
    public void setA4WDStatus(boolean a4WDStatus) { this.a4WDStatus = a4WDStatus; }
    public boolean isSportsStatus() { return sportsStatus; }
    public void setSportsStatus(boolean sportsStatus) { this.sportsStatus = sportsStatus; }
}
