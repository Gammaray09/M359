package Unit5_WritingClasses.examples.HeroVillainExamples;

public class MarvelMovieTester {
    public static void main(String[] args) {
        Power lighting = new Power("lighting", 8);
        Power strength = new Power("Super Strength", 10);

        SuperHero Thor = new SuperHero("Thor", lighting);
        SuperHero Captain_America = new SuperHero("Captain America", strength);
        Villain Thanos = new Villain("Thanos", strength);

        Thanos.getSuperPower().setStrength(15);

        System.out.println(Thanos);
        System.out.println(Captain_America);
    }
}
