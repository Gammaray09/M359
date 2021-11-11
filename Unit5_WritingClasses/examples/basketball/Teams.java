package Unit5_WritingClasses.examples.basketball;

public class Teams {
    // instances variable from team name(String) and 2 players from player class
    private String teamName;
    private Players p1;
    private Players p2;
    private int totalTeamSkills;

    /**
     * Constructor takes in all instance variables
     * Sets instance variable from player object to each player variable
     * @param teamName
     * @param p1
     * @param p2
     */
    public Teams(String teamName, Players p1, Players p2) {
        this.teamName = teamName;
        this.p1 = new Players(p1.getName(), p1.getHeight(), p1.getWeight(), p1.getSkillProfile());
        this.p2 = new Players(p2.getName(), p2.getHeight(), p2.getWeight(), p2.getSkillProfile());
        totalTeamSkills = p1.getTotalSkills() + p2.getTotalSkills();
    }

    //get and set methods
    public String getTeamName() { return teamName; }
    public void setTeamName(String teamName) { this.teamName = teamName; }
    public Players getP1() { return p1; }
    public void setP1(Players p1) { this.p1 = p1; }
    public Players getP2() { return p2; }
    public void setP2(Players p2) { this.p2 = p2; }
    public int getTotalTeamSkills() {return totalTeamSkills;}
    public void setTotalTeamSkills(int totalTeamSkills) {this.totalTeamSkills = totalTeamSkills;}

}