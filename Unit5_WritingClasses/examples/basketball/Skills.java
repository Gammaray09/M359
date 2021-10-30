package Unit5_WritingClasses.examples.basketball;

public class Skills {
    private int shooting;
    private int dribbling;
    private int rebounding;
    private int stealing;
    private int blocking;

    public Skills(int shooting, int dribbling, int rebounding, int stealing, int blocking) {
        this.shooting = shooting;
        this.dribbling = dribbling;
        this.rebounding = rebounding;
        this.stealing = stealing;
        this.blocking = blocking;
    }

    public int getShooting() {
        return shooting;
    }

    public void setShooting(int shooting) {
        this.shooting = shooting;
    }

    public int getDribbling() {
        return dribbling;
    }

    public void setDribbling(int dribbling) {
        this.dribbling = dribbling;
    }

    public int getRebounding() {
        return rebounding;
    }

    public void setRebounding(int rebounding) {
        this.rebounding = rebounding;
    }

    public int getStealing() {
        return stealing;
    }

    public void setStealing(int stealing) {
        this.stealing = stealing;
    }

    public int getBlocking() {
        return blocking;
    }

    public void setBlocking(int blocking) {
        this.blocking = blocking;
    }

}
