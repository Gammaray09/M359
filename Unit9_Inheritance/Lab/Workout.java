package Unit9_Inheritance.Lab;

public class Workout {
    private String name;
    private int workoutNum;
    private int duration;

    public Workout(String name, int workoutNum, int duration) {
        this.name = name;
        this.workoutNum = workoutNum;
        this.duration = duration;
    }

    public int startExercise(){
        System.out.println("Starting a Workout");
        return 0;
    }



    public String toString() {
        return "Workout#"+this.workoutNum + "\t\t" + this.name + "\t" + this.duration;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getWorkoutNum() {return workoutNum;}
    public void setWorkoutNum(int workoutNum) {this.workoutNum = workoutNum;}
    public int getDuration() {return duration;}
    public void setDuration(int duration) {this.duration = duration;}
}
