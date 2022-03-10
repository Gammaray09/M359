package Unit9_Inheritance.Lab;

public class WorkoutPlan {
    private Workout[][] workouts;
    private int curWeek;
    private int workoutsCompleted;
    private int workoutsSkipped;
    private int nextWorkoutNum;
    private int totalCals;
    private int totalMins;

    int CARDIO = 1;
    int STRENGTH = 2;
    int WELLNESS = 3;

    public WorkoutPlan(int weeks) {
        this.workouts = new Workout[weeks][7];
        this.curWeek = 0;
        this.workoutsCompleted = 0;
        this.workoutsSkipped = 0;
        this.nextWorkoutNum = 1;
        this.totalCals = 0;
        this.totalMins = 0;
    }
    
    
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


    private Cardio createCardio(){
        int time = (int)(Math.random() * 30) + 10;
        int speed = (int)(Math.random() * 6) + 1;
        return new Cardio(this.nextWorkoutNum,time,speed);
    }


    private Strength createStrength(){
        int time = (int)(Math.random() * 45) + 15;
        int weight = (int)(Math.random() * 130) + 95;
        return new Strength(this.nextWorkoutNum,time,weight);
    }

    private Wellness createWellness(){
        int time = (int)(Math.random() * 30) + 30;
        int stretches = (int)(Math.random() * 4) + 8;
        return new Wellness(this.nextWorkoutNum,time,stretches);
    }


    public String toString() {
        String output = "";
        for (int row = 0; row < workouts.length; row++) {
            output += "*** WEEK #" + (row + 1) +" ***\n";
            output += "WORKOUT\tNUM\t\tNAME\t\tMINUTES\n";
            for (int col = 0; col < workouts[0].length; col++) {
                output += workouts[row][col] + "\n";
            }
            output+= "\n";
        }
        return output;
    }


    public void printProgress() {
        String output = "*** CURRENT PROGRESS ***\n";
        output += "Number of workouts completed:  " + this.workoutsCompleted + "\n";
        output += "Number of workouts skipped:  " + this.workoutsSkipped + "\n";
        output += "Total minutes of exercise:  " + this.totalMins + "\n";
        output += "Total calories burned:  " + this.totalCals + "\n";
        System.out.println(output);
    }

    public void workoutNextWeek(){
        for (int i = 0; i < workouts[0].length; i++) {
            int random = (int)(Math.random() * 9)+1;
            if(random < 2){
                System.out.println("Workout Number " + this.nextWorkoutNum + " was skipped");
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


    public int getCurWeek() { return curWeek; }
    public void setCurWeek(int curWeek) { this.curWeek = curWeek; }
    public int getWorkoutsCompleted() { return workoutsCompleted; }
    public void setWorkoutsCompleted(int workoutsCompleted) { this.workoutsCompleted = workoutsCompleted; }
    public int getWorkoutsSkipped() { return workoutsSkipped; }
    public void setWorkoutsSkipped(int workoutsSkipped) { this.workoutsSkipped = workoutsSkipped; }
    public int getNextWorkoutNum() { return nextWorkoutNum; }
    public void setNextWorkoutNum(int nextWorkoutNum) { this.nextWorkoutNum = nextWorkoutNum; }
    public int getTotalCals() { return totalCals; }
    public void setTotalCals(int totalCals) { this.totalCals = totalCals; }
    public int getTotalMins() { return totalMins; }
    public void setTotalMins(int totalMins) { this.totalMins = totalMins; }





}
