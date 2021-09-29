package Unit3_Booleans_IfStatements.Homework.ChevroletLab;

public class Chevy {
    private int year;
    private int mileage;
    private double fuelEfficiency;
    private double price;
    private String model;
    private String color;
    private boolean luxStatus;
    private boolean a4WDStatus;
    private boolean sportsStatus;

    //constants
    public final String VEHICLE_MAKE = "Chevrolet";
    public final double TAX_RATE = 0.122;
    public final double LUX_PRICE = 0.2;
    public final int FOUR_WD = 3500;
    public final double SPORTS_PRICE = 0.15;
    public final double FUEL_EFFICIENCY_DEDUCT = 0.2;

    //Constructors
    public Chevy() {
        this.year = 2021;
        this.mileage = 0;
        this.fuelEfficiency = 35;
        this.price = 16000.0;
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
    public int compareTo(Chevy other){
        if(this.price - other.price > 0){
            return 1;
        } else if (this.price - other.price < 0){
            return -1;
        } else{
            return 0;
        }
    }

    public boolean equal(Chevy other){
        String vehicle1 = "";
        String vehicle2 = "";
        if (this.mileage < 200){
            vehicle1 = "new";
        } else{
            vehicle1 = "used";
        }
        if (this.mileage < 200){
            vehicle2 = "new";
        } else{
            vehicle2 = "used";
        }

        if(this.model.equals(other.model) && this.color.equals(other.color) && vehicle1.equals(vehicle2)){
            return true;
        } else {
            return false;
        }
    }


    public double calcPrice(){
        double total = this.price;
        if(luxStatus == true){
            this.price += (total * LUX_PRICE);
        }
        if(a4WDStatus == true){
            this.price += FOUR_WD;
        }
        if(sportsStatus == true){
            this.price += (total * SPORTS_PRICE);
            this.fuelEfficiency -= this.fuelEfficiency * FUEL_EFFICIENCY_DEDUCT ;
        }
        this.price += (this.price * TAX_RATE) ;
        return this.price;
    }


    public String toString(){

        String packages = "";
        if(luxStatus == true){
            packages += "\t\t\t-Luxary Package";
        }
        if(a4WDStatus == true){
            packages += "\n\t\t\t-4WD Package";
        }
        if (sportsStatus == true){
            packages += "\n\t\t\t-Sports Package";
        }
        if(luxStatus == false && a4WDStatus == false && sportsStatus == false) {
            packages = "\t\t\t-None";
        }

        String output = year + " " + VEHICLE_MAKE + " " + model + "(" + color + ")\n\t PRICE: \t\t\t$" + this.calcPrice() + "\n\t MILES:\t\t\t\t" +
                mileage + "\n\t FUEL EFFICIENCY:\t" + fuelEfficiency + "mpg" +"\n\t PACKAGES:\n" + packages;
        return output;
    }

    // Getters and Setters
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
    public int getMileage() { return mileage; }
    public void setMileage(int mileage) { this.mileage = mileage; }
    public double getFuelEfficiency() { return fuelEfficiency; }
    public void setFuelEfficiency(double fuelEfficiency) { this.fuelEfficiency = fuelEfficiency; }
    public double getPrice() { return price; }
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
