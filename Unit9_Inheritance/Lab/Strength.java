package Unit9_Inheritance.Lab;

public class Strength extends Workout{
    // instance variable
    private int weight;

    //constructor that takes in workoutNum, duration, and weight
    public Strength( int workoutNum, int duration, int weight) {
        super("Lifting", workoutNum, duration);
        this.weight = weight;
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
     * Generates a random number between 1 and 3 representing a multiplier for the weight
     * @return the calculated amount for the total calories burned from the product of the multiplier and weight
     */
    @Override
    public int startExercise(){
        double multiplier = (Math.random() * 2) + 1;
        return (int)(multiplier *this.weight);
    }


}
