package Unit5_WritingClasses.examples.HeroVillainExamples;

public class Villain {
    public String name;
    public Power superPower;

    private static int numVillians = 0;
    private static double totalStrength = 0;

    public Villain(String name, Power superPower) {
        this.name = name;
        this.superPower = new Power(superPower.getPower(), superPower.getStrength());
        numVillians++;
        totalStrength += superPower.getStrength();
    }


    public String getVillain() { return name; }
    public void setVillain(String name) { this.name = name; }
    public Power getSuperPower() { return superPower; }
    public void setSuperPower(Power superPower) { this.superPower = superPower; }

    public String getName() {
        return name;
    }

    public static int getNumVillians() {
        return numVillians;
    }

    public static double getTotalStrength() {
        return totalStrength;
    }

    public String toString() { return "Villain:" + name + "\n" + superPower.toString();}
}
