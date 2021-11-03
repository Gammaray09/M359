package Unit5_WritingClasses.examples.basketball;

public class Teams {
    // instances variable from team name(String) and 4 players from player class
    private String teamName;
    private Players p1;
    private Players p2;
    private Players p3;
    private Players p4;
    private int totalTeamSkills;

    /**
     * Constructor takes in all instance variables
     * Sets instance variable from player object to each player variable
     * @param teamName
     * @param p1
     * @param p2
     * @param p3
     * @param p4
     */
    public Teams(String teamName, Players p1, Players p2, Players p3, Players p4) {
        this.teamName = teamName;
        this.p1 = new Players(p1.getName(), p1.getHeight(), p1.getWeight(), p1.getSkillProfile());
        this.p2 = new Players(p2.getName(), p2.getHeight(), p2.getWeight(), p2.getSkillProfile());
        this.p3 = new Players(p3.getName(), p3.getHeight(), p3.getWeight(), p3.getSkillProfile());
        this.p4 = new Players(p4.getName(), p4.getHeight(), p4.getWeight(), p4.getSkillProfile());
        totalTeamSkills = p1.getTotalSkills() + p2.getTotalSkills() + p3.getTotalSkills() + p4.getTotalSkills();
    }
    //get and set methods
    public String getTeamName() { return teamName; }

    public void setTeamName(String teamName) { this.teamName = teamName; }

    public Players getP1() { return p1; }

    public void setP1(Players p1) { this.p1 = p1; }

    public Players getP2() { return p2; }

    public void setP2(Players p2) { this.p2 = p2; }

    public Players getP3() { return p3; }

    public void setP3(Players p3) { this.p3 = p3; }

    public Players getP4() { return p4; }

    public void setP4(Players p4) { this.p4 = p4; }

    public int getTotalTeamSkills() {return totalTeamSkills;}

    public void setTotalTeamSkills(int totalTeamSkills) {this.totalTeamSkills = totalTeamSkills;}


    public String toString() {
        return "Team Name: " + teamName + "\n" + p1 + p2 + p3 + p4;
    }
}
