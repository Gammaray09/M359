package Unit5_WritingClasses.examples.basketball;

public class Skills {
    // instance variables for shooting, dribbling, rebounding, stealing, and blocking (All int)
    private int shooting;
    private int dribbling;
    private int rebounding;
    private int stealing;
    private int blocking;

    /**
     * Constructor takes in all instance variables
     * @param shooting
     * @param dribbling
     * @param rebounding
     * @param stealing
     * @param blocking
     */
    public Skills(int shooting, int dribbling, int rebounding, int stealing, int blocking) {
        this.shooting = shooting;
        this.dribbling = dribbling;
        this.rebounding = rebounding;
        this.stealing = stealing;
        this.blocking = blocking;
    }

    public int getShooting() { return shooting; }

    public void setShooting(int shooting) {
        if (shooting >= 0) {
            this.shooting = shooting;
        }else{
            this.shooting = 0;
        }
    }

    public int getDribbling() {
        return dribbling; }

    public void setDribbling(int dribbling) {
        if (dribbling >= 0){
            this.dribbling = dribbling;
        }else{
            this.dribbling = 0;
        }
    }

    public int getRebounding() { return rebounding; }

    public void setRebounding(int rebounding) {
        if (rebounding >= 0){
            this.rebounding = rebounding;
        }else{
            this.rebounding = 0;
        }
    }

    public int getStealing() { return stealing; }

    public void setStealing(int stealing) {
        if (stealing >= 0){
            this.stealing = stealing;
        }else{
            this.stealing = 0;
        }
    }

    public int getBlocking() { return blocking; }

    public void setBlocking(int blocking) {
        if (blocking >= 0){
            this.blocking = blocking;
        }else{
            this.blocking = 0;
        }
    }



    /**
     * This method returns all the stats of the object in proper format
     * @return
     */
    public String toString() {
        return "Stats: " + "\n\tShooting: " + shooting +
                "\n\tDribbling : " + dribbling +
                "\n\tRebounding: " + rebounding +
                "\n\tStealing: " + stealing +
                "\n\tBlocking: " + blocking;
    }

}
