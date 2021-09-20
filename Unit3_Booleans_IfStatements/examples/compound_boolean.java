package Unit3_Booleans_IfStatements.examples;

public class compound_boolean {
    public static void main(String[] args) {
        String day = "Monday";
        int numAssignments = 2;

        if(day.equals("Saturday")  || numAssignments == 0 ){
            System.out.println("Yay! video games!");
        } else {
            System.out.println("Guess I will have to wait");
        }





        //2 Bob only goes to coding club if it is Monday and he has less than two homework assignments
        if(day.equals("Monday") && numAssignments <= 2){
            System.out.println("Yay, Coding club!");
        } else {
            System.out.println("Today is a sad day");
        }



        //Carol exercises on the weekends. On the weekdays, she exercises with 80% probability if she has no hw but only with 30% probability if she has any hw.

        int probability = (int)(Math.random() * 10 +1);
        if(day.equals("Saturday") || day.equals("Sunday")){
            System.out.println("Exercise");
        } else {
            if (numAssignments == 0 && (probability >= 1 && probability <= 8) ){
                System.out.println("exercise");
            } else if(numAssignments >= 1 && (probability >= 1 && probability <= 3)){
                System.out.println("exercise");
            } else {
                System.out.println("No exercise");
            }
        }
    }
}
