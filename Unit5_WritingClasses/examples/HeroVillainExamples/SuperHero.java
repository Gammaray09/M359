package Unit5_WritingClasses.examples.HeroVillainExamples;

public class SuperHero {
    private String name;
    private Power superPower;

    public SuperHero(String name, Power superPower) {
        this.name = name;
        this.superPower = superPower;
    }

    public String getHero() { return name; }
    public void setHero(String name) {this.name = name; }
    public Power getSuperPower() { return superPower; }
    public void setSuperPower(Power superPower) { this.superPower = superPower; }

    public String toString() { return "hero:" + name + "\n" + superPower.toString(); }
}
