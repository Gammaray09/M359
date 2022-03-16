package Unit9_Inheritance.Lab;

public class Wellness extends Workout{
    // instance variable
    private int numStretches;

    //constructor that takes in workoutNum, duration, and numStretches
    public Wellness( int workoutNum, int duration, int numStretches) {
        super("Stretching", workoutNum, duration);
        this.numStretches = numStretches;
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
            return "Workout #" + super.getWorkoutNum() + ":\t" + super.getName() + "\t" + super.getDuration();
        }else{
            return "Workout #" + super.getWorkoutNum() + ":\t\t" + super.getName() + "\t" + super.getDuration();
        }
    }


    /**
     * This method generates a random number between 5 and 10 for the calories burned per stretch
     * @return the calculated amount for the total calories burned from he product of the
     * calories per stretch and stretches
     */
    @Override
    public int startExercise(){
        double calPerStretch = (Math.random() * 5) + 5;
        return (int)(calPerStretch *this.numStretches);
    }


}
