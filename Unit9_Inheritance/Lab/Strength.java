package Unit9_Inheritance.Lab;

public class Strength extends Workout{
    private int weight;

    public Strength( int workoutNum, int duration, int weight) {
        super("Lifting", workoutNum, duration);
        this.weight = weight;
    }

    @Override
    public String toString() {
        if(super.getWorkoutNum() >= 10) {
            return "Workout #" + super.getWorkoutNum() + ":\t" + super.getName() + "\t\t" + super.getDuration();
        }else{
            return "Workout #" + super.getWorkoutNum() + ":\t\t" + super.getName() + "\t\t" + super.getDuration();
        }
    }

    @Override
    public int startExercise(){
        double multiplier = (Math.random() * 2) + 1;
        return (int)(multiplier *this.weight);
    }

    public int getWeight() {return weight;}
    public void setWeight(int weight) {this.weight = weight;}
}
