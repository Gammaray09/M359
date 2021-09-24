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
    final double TAX_RATE = 0.122;
    final double LUX_PRICE = 0.2;
    final int FOUR_WD = 3500;
    final double SPORTS_PRICE = 0.15;
    final double FUEL_EFFICIENCY_DEDUC = 0.2;

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
    public int compareTo(Chevy other){ return this.price - other.price;}

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

    public String toString(){
        String packages = "";
        if(luxStatus == true && a4WDStatus == true && sportsStatus == true){
            packages = "\t\t\t-Luxary Package\n\t\t\t-4WD Package\n\t\t\t-Sports Package";
        } else if(luxStatus == true && a4WDStatus == true){
            packages = "\t\t\t-Luxary Package\n\t\t\t-4WD Package";
        } else if (luxStatus == true){
            packages = "\t\t\t-Luxary Package";
        } else {
            packages = "\t\t\t-None";
        }

        String output = year + " " + model + " (" + color + ")\n\t PRICE: \t" + price + "\n\t MILES:\t" +
                mileage + "\n\t FUEL EFFICIENCY:\t" + fuelEfficiency + "mpg" +"\n\t PACKAGES:\n" + packages;
        return output;
    }

    public double calcPrice(){
        double total = price;
        if(luxStatus == true && a4WDStatus == true && sportsStatus == true){
            total = (total * LUX_PRICE + total) + (total + FOUR_WD) + (total * SPORTS_PRICE + total) +(total * TAX_RATE + total);
            return total;
        } else if(luxStatus == true && a4WDStatus == true){
            total = (total * LUX_PRICE + total) + (total + FOUR_WD)+(total * TAX_RATE + total);
            return total;
        } else if (luxStatus == true){
            total = (total * LUX_PRICE + total)+(total * TAX_RATE + total);
            return total;
        } else {
            return (total * TAX_RATE + total);
        }
    }

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
