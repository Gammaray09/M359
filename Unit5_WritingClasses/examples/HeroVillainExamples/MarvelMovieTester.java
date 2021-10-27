package Unit5_WritingClasses.examples.HeroVillainExamples;

public class MarvelMovieTester {
    public static void main(String[] args) {
        Power lighting = new Power("lighting", 8.0);
        Power strength = new Power("Super Strength", 15.0);

        SuperHero Thor = new SuperHero("Thor", lighting);
        Villain Thanos = new Villain("Thanos", strength);


        System.out.println(Thanos);
        System.out.println(Thor);


    }

    /**
     * This simulates a battle between hero and villain
     *      * which ever has the greater strength
     *      *      Winner will gain 10% of the strength of the loser
     *      *      Loser will lose 8-30% of there own Strength
     *      *      If it is a tie. they both will lose 8-30% of there own Strength
     *      *      print result afterword
     * @param hero
     * @param villain
     */
    public static void battle (SuperHero hero, Villain villain){
        double heroStrength = hero.getSuperPower().getStrength();
        double villainStrength = hero.getSuperPower().getStrength();
        double random = (int)(Math.random() * 31 + 5);
        String winner = "";
        // hero wins
        if(heroStrength > villainStrength){
            // take 10% of villain power
            heroStrength =(villainStrength * 0.10) + heroStrength;
            villainStrength =(villainStrength - random * 0.01) + villainStrength;
            winner = "The winner is" + hero.getName();
        // villain wins
        } else if(heroStrength > villainStrength){
            villainStrength =(heroStrength * 0.10) + villainStrength;
            heroStrength =(heroStrength - random * 0.01) + heroStrength;
            winner = "The winner is";
        // both tie
        } else {
            villainStrength =(villainStrength * random) + villainStrength;
            heroStrength = (heroStrength - random * 0.01) + heroStrength;
            winner = "Its a Tie";
        }
        // Now that we are done calculating the power set it
        hero.getSuperPower().setStrength(heroStrength);
        villain.getSuperPower().setStrength(villainStrength);
        System.out.println(winner);

    }
}
