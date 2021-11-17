package Unit5_WritingClasses.examples.basketball;

// Stephen Thomas and Aashman Sharma
// Mr. Moon, 6th period
// This class makes the skill object

public class Skills {
    // instance variables for shooting, dribbling, rebounding, stealing, and blocking (All int)
    private String name;
    private int shooting;
    private int dribbling;
    private int rebounding;
    private int stealing;
    private int blocking;


    /**
     * Constructor takes in all instance variables
     * @param name
     * @param shooting
     * @param dribbling
     * @param rebounding
     * @param stealing
     * @param blocking
     */

    public Skills(String name, int shooting, int dribbling, int rebounding, int stealing, int blocking) {
        this.name = name;
        this.shooting = shooting;
        this.dribbling = dribbling;
        this.rebounding = rebounding;
        this.stealing = stealing;
        this.blocking = blocking;
    }

    // get and set methods
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getShooting() { return shooting; }
    // Lines 36-33 is so that the stats don't go over 20
    // Lines 38-39 is if greater than 0 but less than 20 the stats can increase in training
    // Lines 40-41 is that the stats can't go less than 0
    public void setShooting(int shooting) {
        if (shooting >= 20){
            this.shooting = 20;
        } else if (shooting >= 0) {
            this.shooting = shooting;
        }else{
            this.shooting = 0;
        }
    }

    public int getDribbling() {return dribbling; }

    // same as shooting
    public void setDribbling(int dribbling) {
        if (dribbling >= 20){
            this.dribbling = 20;
        } else if (dribbling >= 0) {
            this.dribbling = dribbling;
        }else{
            this.dribbling = 0;
        }
    }

    public int getRebounding() { return rebounding; }

    // same as dribbling & shooting
    public void setRebounding(int rebounding) {
        if (rebounding >= 20){
            this.rebounding = 20;
        } else if (rebounding >= 0) {
            this.rebounding = rebounding;
        }else{
            this.rebounding = 0;
        }
    }

    public int getStealing() { return stealing; }

    // same as shooting, dribbling & rebounding
    public void setStealing(int stealing) {
        if (stealing >= 20){
            this.stealing = 20;
        } else if (stealing >= 0) {
            this.stealing = stealing;
        }else{
            this.stealing = 0;
        }
    }

    public int getBlocking() { return blocking; }

    // same as all the other set methods
    public void setBlocking(int blocking) {
        if (blocking >= 20){
            this.blocking = 20;
        } else if (blocking >= 0) {
            this.blocking = blocking;
        }else{
            this.blocking = 0;
        }
    }

    /**
     * This method returns all the stats of the object in proper format
     * @return returns string
     */

    // The toString method prints all the instance variables out in order
    public String toString() {
        return name +":" + "\n\tShooting: " + shooting +
                "\n\tDribbling : " + dribbling +
                "\n\tRebounding: " + rebounding +
                "\n\tStealing: " + stealing +
                "\n\tBlocking: " + blocking +"\n";
    }

}





