package Unit5_WritingClasses.examples.HeroVillainExamples;

public class Power {
    private String power;
    private double strength;

    public Power(String power, double strength) {
        this.power = power;
        this.strength = strength;
    }

    public String getPower() { return power; }
    public void setPower(String power) { this.power = power; }
    public double getStrength() { return strength; }
    public void setStrength(double strength) { this.strength = strength; }

    public String toString() { return "Power:" + power + "\n" + "Strength:" + strength ; }
}
