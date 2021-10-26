package Unit5_WritingClasses.examples.HeroVillainExamples;

public class SuperHero {
    private String name;
    private Power superPower;

    public SuperHero(String name, Power superPower) {
        this.name = name;
        this.superPower = new Power(superPower.getPower(), superPower.getStrength());
    }

    public String getName() { return name; }
    public void setName(String name) {this.name = name; }
    public Power getSuperPower() { return superPower; }
    public void setSuperPower(Power superPower) { this.superPower = superPower; }

    public String toString() { return "Hero:" + name + "\n" + superPower.toString(); }
}
