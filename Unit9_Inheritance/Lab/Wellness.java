package Unit9_Inheritance.Lab;

public class Wellness extends Workout{
    private int numStretches;

    public Wellness( int workoutNum, int duration, int numStretches) {
        super("Stretching", workoutNum, duration);
        this.numStretches = numStretches;
    }

    @Override
    public String toString() {
        if(super.getWorkoutNum() >= 10) {
            return "Workout #" + super.getWorkoutNum() + ":\t" + super.getName() + "\t" + super.getDuration();
        }else{
            return "Workout #" + super.getWorkoutNum() + ":\t\t" + super.getName() + "\t" + super.getDuration();
        }
    }

    @Override
    public int startExercise(){
        double calPerStretch = (Math.random() * 5) + 5;
        return (int)(calPerStretch *this.numStretches);
    }

    public int getNumStretches() {return numStretches;}
    public void setNumStretches(int numStretches) {this.numStretches = numStretches;}
}
