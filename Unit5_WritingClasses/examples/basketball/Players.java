package Unit5_WritingClasses.examples.basketball;

// Stephen Thomas and Aashman Sharma
// Mr. Moon, 6th period

public class Players {
    // instance variables of name(String), height(String), weight(int), skill profile from Skills class
    private String name;
    private String height;
    private int weight;
    private Skills skillProfile;
    private int totalSkills;

    /**
     * Constructor takes in all instance variables
     * Grabs instance variable from Skill object and sets it to skillProfile
     * Adds all the instance variable from Skills object to totalSkills
     * @param name
     * @param height
     * @param weight
     * @param skillProfile
     */

    public Players(String name, String height, int weight, Skills skillProfile) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        // Grabs all instance variable from Skills object
        this.skillProfile = new Skills(skillProfile.getName(), skillProfile.getShooting(), skillProfile.getDribbling()
                , skillProfile.getRebounding(), skillProfile.getStealing(), skillProfile.getBlocking());

        this.totalSkills = skillProfile.getShooting() + skillProfile.getDribbling() + skillProfile.getRebounding()
                + skillProfile.getStealing() + skillProfile.getBlocking();

    }
    //get and set methods
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getHeight() { return height; }
    public void setHeight(String height) { this.height = height; }
    public int getWeight() { return weight; }
    public void setWeight(int weight) { this.weight = weight; }
    public Skills getSkillProfile() {return skillProfile;}
    public void setSkillProfile(Skills skillProfile) {this.skillProfile = skillProfile;}
    public int getTotalSkills() {return totalSkills;}
    public void setTotalSkills(int totalSkills) {this.totalSkills = totalSkills;}

    /**
     * This method returns all the stats of the object in proper format
     * It also adds the toString() method from the Skills class
     * @return
     */

    // The toString method prints all the instance variables in a neat fashion
    public String toString() {
        return "\nName: " + name + "\n" +
                "Height: " + height + "\n" +
                "Weight: " + weight + "\n" +
                skillProfile;
    }
}

