package Unit7_ArrayList.Lab;

public class Show {
    private String date;
    private double price;
    private int quantity;
    private String name;
    private String location;



    public Show(String date, double price, int quantity, String name, String location) {
        this.date = date;
        this.price = price;
        this.quantity = quantity;
        this.name = name;
        this.location = location;
    }

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


    public String toString() {
        return date +"\t$" + price + "\t\t" + quantity + "\t\t" + name + "\t\t" + location;
    }
}
