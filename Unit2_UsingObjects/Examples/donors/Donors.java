package Unit2_UsingObjects.Examples.donors;

public class Donors {
    private String name;
    private String date;
    private double money;
    private String charName;

    public Donors(String aDate, double numMoney, String aCharName, String aName){
        name = aName;
        date = aDate;
        money = numMoney;
        charName = aCharName;
    }

    public Donors( String aDate, double numMoney, String aCharName){
        name = "Anonymous";
        date = aDate;
        money = numMoney;
        charName = aCharName;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }
    public double getMoney(){
        return money;
    }
    public void setName(double getMoney){
        money = getMoney;
    }
    public String getDate(){
        return date;
    }
/*    public void setName(String setdate){
        date = setdate;
    }

 */
    public String getCharName(){
        return charName;
    }

/*
    public void setName(String setCharName){
        charName = setCharName;
    }
*/
    public void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("Date: " + date);
        System.out.println("Money: " + money);
        System.out.println("Charity: " + charName);
    }
}
