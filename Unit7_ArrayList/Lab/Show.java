package Unit7_ArrayList.Lab;

public class Show {
    // private variables
    private String date;
    private double price;
    private int quantity;
    private String name;
    private String location;

    // static variable for text colors
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String RESET = "\033[0m";  // Text Reset


    //constructors
    public Show(String date, double price, int quantity, String name, String location) {
        this.date = date;
        this.price = price;
        this.quantity = quantity;
        this.name = name;
        this.location = location;
    }

    //accessor methods
    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
    public double getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }


    /**
     * This method prints out objects in a neat way that is
     * allinged with the header
     * @return
     */
    public String toString() {
        String newWord = name;
        String space ="";
        if(name.length() < 20){
            int spaceAdd = 20 - name.length();
            for (int i = 0; i < spaceAdd; i++) {
                space += " ";
            }
        }
        return date +"\t$" + price + "\t\t" + quantity + "\t\t" + name + space + location;
    }
}
