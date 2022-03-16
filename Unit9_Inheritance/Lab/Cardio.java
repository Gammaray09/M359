package Unit9_Inheritance.Lab;

public class Cardio extends Workout{
    //instance variables
    private double distance;
    private double speed;


    //constructor that takes in workoutNum, duration, and speed
    public Cardio(int workoutNum, int duration, double speed) {
        super("Running", workoutNum, duration);
        this.distance = speed * (duration/60);
        this.speed = speed;
    }


    /**
     * print the workout number, name and duration in proper format
     * An if statement is used to accommodate for the extra digit and align information
     *
     * @return returns description of object in proper format
     */
    @Override
    public String toString() {
        if(super.getWorkoutNum() >= 10) {
            return "Workout #" + super.getWorkoutNum() + ":\t" + super.getName() + "\t\t" + super.getDuration();
        }else{
            return "Workout #" + super.getWorkoutNum() + ":\t\t" + super.getName() + "\t\t" + super.getDuration();
        }
    }


    /**
     * Generates a random number between 80 and 140 representing the calories burned per mile
     * @return the calculated amount for the total calories burned from the product of the calPerMile and distance
     */
    @Override
    public int startExercise(){
        double calPerMile = (Math.random() * 60) + 80;
        return (int)(calPerMile *this.distance);
    }




}
