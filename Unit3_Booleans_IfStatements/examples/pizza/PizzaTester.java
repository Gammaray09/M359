package Unit3_Booleans_IfStatements.examples.pizza;

public class PizzaTester {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("Dominos", 12, 3, true);
        Pizza pizza2 = new Pizza("Pizza Hut", 6, false);
        Pizza pizza3 = new Pizza("Pizza Hut", 14, 2, true);

     //print pizza objects using the methods we wrote
        pizza1.printInfo();
        pizza2.printInfo();
        System.out.println(pizza3); // Java calls the toString() methods

        //check if pizza is from the same store
        if(pizza2.equals(pizza3)){
            System.out.println("From same store");
        } else {
            System.out.println("Not from same store");
        }




    }
}
