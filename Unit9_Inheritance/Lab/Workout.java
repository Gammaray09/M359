package Unit9_Inheritance.Lab;

public class Workout {
    //instance variables
    private String name;
    private int workoutNum;
    private int duration;

    //constructor takes in a name, workoutnum, and duration
    public Workout(String name, int workoutNum, int duration) {
        this.name = name;
        this.workoutNum = workoutNum;
        this.duration = duration;
    }

    /**
     * prints "Starting a Workout"
     * @return returns a 0
     */
    public int startExercise(){
        System.out.println("Starting a Workout");
        return 0;
    }


    /**
     * print the workout number, name and duration in proper format
     * @return returns description of object in proper format
     */
    public String toString() {
        return "Workout#"+this.workoutNum + "\t\t" + this.name + "\t" + this.duration;
    }


    //a accessor methods
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getWorkoutNum() {return workoutNum;}
    public int getDuration() {return duration;}
}

bfeaI