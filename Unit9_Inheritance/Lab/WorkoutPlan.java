package Unit9_Inheritance.Lab;

public class WorkoutPlan {
    //Instance variables
    private Workout[][] workouts;
    private int curWeek;
    private int workoutsCompleted;
    private int workoutsSkipped;
    private int nextWorkoutNum;
    private int totalCals;
    private int totalMins;

    // final variables
    int CARDIO = 1;
    int STRENGTH = 2;
    int WELLNESS = 3;
    public static final String BOXING = "\033[0;51m";   // BLACK
    public static final String RESET = "\033[0m";  // Text Reset
    public static final String LIGHT_BLUE = "\033[38;2;120;172;255m"; //LIGHT BLUE
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW

    //constructor
    public WorkoutPlan(int weeks) {
        this.workouts = new Workout[weeks][7];
        this.curWeek = 0;
        this.workoutsCompleted = 0;
        this.workoutsSkipped = 0;
        this.nextWorkoutNum = 1;
        this.totalCals = 0;
        this.totalMins = 0;
    }

    /**
     * This method fills the 2d array with different workouts
     * This method gives a 1 out of 3 chance for each workout using a random num
     * Depending on what the random number is, a helper method will be called to create the object
     */
    public void createPlan(){
        for (int row = 0; row < workouts.length; row++) {
            for (int col = 0; col < workouts[0].length; col++) {
                int random = (int)(Math.random() * 3) + 1;
                if(random == CARDIO){
                    workouts[row][col] = createCardio();
                }
                if(random == STRENGTH){
                    workouts[row][col] = createStrength();
                }
                if(random == WELLNESS){
                    workouts[row][col] = createWellness();
                }
                this.nextWorkoutNum++;
            }
        }
    }


    /**
     * This method creates a cardio object with random numbers to be put in the array
     * the time is decided with a random num from 10 to 40
     * the speed is decided with a random num from 1 to 7
     *
     * @return a cardio object to be put in the array
     */
    private Cardio createCardio(){
        int time = (int)(Math.random() * 30) + 10;
        int speed = (int)(Math.random() * 6) + 1;
        return new Cardio(this.nextWorkoutNum,time,speed);
    }

    /**
     * This method creates a Strength object with random numbers to be put in the array
     * the time is decided with a random num from 15 to 60
     * the weight is decided with a random num from 95 to 125
     *
     * @return a Strength object to be put in the array
     */
    private Strength createStrength(){
        int time = (int)(Math.random() * 45) + 15;
        int weight = (int)(Math.random() * 130) + 95;
        return new Strength(this.nextWorkoutNum,time,weight);
    }


    /**
     * This method creates a Wellness object with random numbers to be put in the array
     * the time is decided with a random num from 30 to 60
     * the stretches is decided with a random num from 8 to 12
     *
     * @return a Wellness object to be put in the array
     */
    private Wellness createWellness(){
        int time = (int)(Math.random() * 30) + 30;
        int stretches = (int)(Math.random() * 4) + 8;
        return new Wellness(this.nextWorkoutNum,time,stretches);
    }


    /**
     * This method returns a header then the entire array schedule in proper format
     *
     * @return the entire Workout array to be printed
     */
    public String toString() {
        String output = "";
        for (int row = 0; row < workouts.length; row++) {
            output += YELLOW_BRIGHT + "*** WEEK #" + (row + 1) +" ***\n" + RESET;
            output += LIGHT_BLUE + "WORKOUT\tNUM\t\tNAME\t\tMINUTES\n" + RESET;
            for (int col = 0; col < workouts[0].length; col++) {
                output += workouts[row][col] + "\n";
            }
            output+= "\n";
        }
        return output;
    }

    /**
     * This method prints the current data of the instance variables in proper format
     */
    public void printProgress() {
        String output = "";
        output += LIGHT_BLUE +"Number of workouts completed:  "+RESET + this.workoutsCompleted + "\n";
        output += LIGHT_BLUE +"Number of workouts skipped:  " +RESET+ this.workoutsSkipped + "\n";
        output += LIGHT_BLUE +"Total minutes of exercise:  " +RESET+ this.totalMins + "\n";
        output += LIGHT_BLUE+"Total calories burned:  " +RESET+ this.totalCals + "\n";
        System.out.println(output);
    }


    /**
     * This method calculates the data from the next workout week
     * Every workout has a 20% chance of being skipped and a message is printed
     * indicated what workout was skipped
     */
    public void workoutNextWeek(){
        for (int i = 0; i < workouts[0].length; i++) {
            int random = (int)(Math.random() * 9)+1;
            if(random < 2){
                System.out.println("\n"+BOXING + "Workout Number " + this.nextWorkoutNum + " was skipped" + RESET);
                this.nextWorkoutNum++;
                this.workoutsSkipped++;
            }else{
                this.totalCals += workouts[curWeek][i].startExercise();
                this.totalMins +=  workouts[curWeek][i].getDuration();
                this.workoutsCompleted++;
            }
        }
        curWeek++;
    }
}
