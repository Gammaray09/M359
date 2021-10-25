package Unit5_WritingClasses.examples.HeroVillainExamples;

public class Power {
    private String power;
    private int strength;

    public Power(String power, int strength) {
        this.power = power;
        this.strength = strength;
    }

    public String getPower() { return power; }
    public void setPower(String power) { this.power = power; }
    public int getStrength() { return strength; }
    public void setStrength(int strength) { strength = strength; }

    public String toString() { return "power:" + power + "\n" + "Strength:" + strength ; }
}
