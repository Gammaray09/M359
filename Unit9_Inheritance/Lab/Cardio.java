package Unit9_Inheritance.Lab;

public class Cardio extends Workout{
    private double distance;
    private double speed;


    public Cardio(
            int workoutNum, int duration, double speed) {
        super("Running", workoutNum, duration);
        this.distance = speed * duration;
        this.speed = speed;
    }


    @Override
    public String toString() {
        return "Workout#"+super.getWorkoutNum() + "\t\t" + super.getName() + "\t" + super.getDuration();
    }

    @Override
    public int startExercise(){
        double calPerMile = (Math.random() * 60) + 80;
        return (int)(calPerMile *this.distance);
    }

    public double getDistance() {return distance;}
    public void setDistance(double distance) {this.distance = distance;}
    public double getSpeed() {return speed;}
    public void setSpeed(double speed) {this.speed = speed;}
}
