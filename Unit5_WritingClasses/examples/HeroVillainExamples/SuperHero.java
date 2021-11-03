package Unit5_WritingClasses.examples.HeroVillainExamples;

public class SuperHero {
    private String name;
    private Power superPower;

    //keeps track of the total # of objects created
    private static int numHeros = 0;
    private static double totalStrength = 0;

    public SuperHero(String name, Power superPower) {
        this.name = name;
        this.superPower = new Power(superPower.getPower(), superPower.getStrength());
        numHeros++;
        totalStrength += superPower.getStrength();
    }


    public String getName() { return name; }
    public void setName(String name) {this.name = name; }
    public Power getSuperPower() { return superPower; }
    public void setSuperPower(Power superPower) { this.superPower = superPower; }

    public static double getTotalStrength() {
        return totalStrength;
    }

    public static int getNumHeros() {
        return numHeros;
    }

    public String toString() { return "Hero:" + name + "\n" + superPower.toString(); }
}
