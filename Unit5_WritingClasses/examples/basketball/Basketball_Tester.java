package Unit5_WritingClasses.examples.basketball;

public class Basketball_Tester {
    public static void main(String[] args) {

        // Creates the GUI object and adds it to your screen
        MyFrame GUI = new MyFrame();
    }

    /**
     * This is the training method that has a 50% chance
     * to increase or decrease the players stats by a random range from 1-10
     * and then prints out the expected result based on the coin flip
     * @param p1
     */
    public static String training(Players p1) {
        String result;
        int coin = (int) (Math.random() * 2 + 1);
        if (coin == 1) {
            int rand = (int) (Math.random() * 9) + 1;
            p1.getSkillProfile().setShooting(p1.getSkillProfile().getShooting() + rand);
            p1.getSkillProfile().setBlocking(p1.getSkillProfile().getBlocking() + rand);
            p1.getSkillProfile().setDribbling(p1.getSkillProfile().getDribbling() + rand);
            p1.getSkillProfile().setRebounding(p1.getSkillProfile().getRebounding() + rand);
            p1.getSkillProfile().setStealing(p1.getSkillProfile().getStealing() + rand);
            result = "Success! " + p1.getName() + " stats have increased by " + rand;
        } else {
            int rand = (int) (Math.random() * 9) + 1;
            p1.getSkillProfile().setShooting(p1.getSkillProfile().getShooting() - rand);
            p1.getSkillProfile().setBlocking(p1.getSkillProfile().getBlocking() - rand);
            p1.getSkillProfile().setDribbling(p1.getSkillProfile().getDribbling() - rand);
            p1.getSkillProfile().setRebounding(p1.getSkillProfile().getRebounding() - rand);
            p1.getSkillProfile().setStealing(p1.getSkillProfile().getStealing() - rand);
            result = "Fail " + p1.getName() + " stats have decreased by " + rand;
        }
        return result;
    }

    /**
     * This is the match method which makes both them face off each other
     * and the team with most total skills will win the game
     * and thus print out the expected result
     *
     * This method uses the getTotalTeamSkills instance variable to get the total
     * @param team1
     * @param team2
     * @return
     */
    public static String match(Teams team1, Teams team2){
        String winner = "";
        if(team1.getTotalTeamSkills() > team2.getTotalTeamSkills()){
            winner = "The winner of the match is the " + team1.getTeamName();
        } else {
            winner = "The winner of the match is the " + team2.getTeamName();
        }
        return winner;
    }
}
