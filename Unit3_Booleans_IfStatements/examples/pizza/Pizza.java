package Unit3_Booleans_IfStatements.examples.pizza;

public class Pizza {
    private String store;
    private int inches;
    private int numToppings;
    private boolean isDeepDish;

  /*  public Pizza(String aStore, int aInch, int aTopping, boolean DeepDish){
        store = aStore;
        inches = aInch;
        numToppings = aTopping;
        isDeepDish = DeepDish;
    }
   */


    public Pizza(String store, int inches, int numToppings, boolean isDeepDish) {
        this.store = store;
        this.inches = inches;
        this.numToppings = numToppings;
        this.isDeepDish = isDeepDish;
    }

    public Pizza(String aStore, int aInch, boolean DeepDish){
        store = aStore;
        inches = aInch;
        numToppings = 0;
        isDeepDish = DeepDish;
    }

    public String getStore() { return store; }
    public void setStore(String store) { this.store = store; }
    public int getInches() { return inches; }
    public void setInches(int inches) { this.inches = inches; }
    public int getNumToppings() { return numToppings; }
    public void setNumToppings(int numToppings) { this.numToppings = numToppings; }
    public boolean isDeepDish() { return isDeepDish; }
    public void setDeepDish(boolean deepDish) { isDeepDish = deepDish; }

    //PrintInfo

    public void printInfo(){
        System.out.println();
        System.out.println("Store: " + this.store);
        System.out.println("inches: " + this.inches);
        System.out.println("Number of Toppings: " + this.numToppings);
        System.out.println("DeepDish: " + this.isDeepDish);
        System.out.println();
    }

    public boolean equals(Pizza other){
        return(this.store.equals(other.store));

    }


    public String toString() {
        return "Pizza{" + "store='" + store + '\'' + ", inches=" + inches + ", numToppings=" + numToppings + ", isDeepDish=" + isDeepDish + '}';
    }
}
