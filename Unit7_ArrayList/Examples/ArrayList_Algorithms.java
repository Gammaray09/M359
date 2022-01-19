package Unit7_ArrayList.Examples;
import java.util.ArrayList;

public class ArrayList_Algorithms {
    public static void main(String[] args) {

        // Define ArrayLists to be used for testing the methods
        ArrayList<Integer> numsNoRepeats = new ArrayList<>();
        numsNoRepeats.add(2);
        numsNoRepeats.add(5);
        numsNoRepeats.add(3);
        numsNoRepeats.add(8);
        numsNoRepeats.add(9);
        numsNoRepeats.add(1);


        ArrayList<Integer> numsRepeats = new ArrayList<>();
        numsRepeats.add(2);
        numsRepeats.add(5);
        numsRepeats.add(1);
        numsRepeats.add(2);
        numsRepeats.add(6);
        numsRepeats.add(8);


        ArrayList<Integer> orderedNums = new ArrayList<>();
        orderedNums.add(2);
        orderedNums.add(3);
        orderedNums.add(8);
        orderedNums.add(11);
        orderedNums.add(15);
        orderedNums.add(19);


        ArrayList<String> names = new ArrayList<>();
        names.add("Mya");
        names.add("John");
        names.add("Kim");
        names.add("Sanjana");
        names.add("Adi");
        names.add("Noah");

        System.out.println("Arrays:");
        System.out.println(numsNoRepeats);
        System.out.println(numsRepeats);
        System.out.println(orderedNums);
        System.out.println(names);
        System.out.println();
        System.out.println("findMin method on numsNoRepeats array: " + findMin(numsNoRepeats));
        System.out.println("findMax method on numsNoRepeats array: " + findMax(numsNoRepeats));
        System.out.println("findSum method on numsNoRepeats array: " + findSum(numsNoRepeats));
        System.out.println("findAverage method on numsNoRepeats array: " + findAverage(numsNoRepeats));
    }

    /**
     * Finds the smallest value in the ArrayList
     * @param list
     * @return returns its int value
     */
    public static int findMin(ArrayList<Integer> list) {
        int smallestNum = list.get(0);
        for(Integer num: list){
            if(num < smallestNum){
                smallestNum = num;
            }
        }
        return smallestNum;
    }

    /**
     * Finds the largest value in the ArrayList
     * @param list
     * @return returns its int value
     */
    public static int findMax(ArrayList<Integer> list) {
        int biggestNum = list.get(0);
        for(Integer num: list){
            if(num > biggestNum){
                biggestNum = num;
            }
        }
        return biggestNum;
    }

    /**
     * Finds the sum of all values in the ArrayList
     * @param list
     * @return returns the int value for the sum
     */
    public static int findSum(ArrayList<Integer> list) {
        int sum = list.get(0);
        for(Integer num: list){
            sum += num;
        }
        return sum;
    }

    /**
     * Finds the average as a double of all Integer values
     * @param list
     * @return double average value
     */
    public static double findAverage(ArrayList<Integer> list) {
        int sum = list.get(0);
        for(Integer num: list){
            sum += num;
        }
        return (double)sum / list.size();
    }

    /**
     * Determines if all values are in increasing order
     * @param list
     * @return true or false if increasing
     */
    public static boolean isIncreasing(ArrayList<Integer> list) {
        boolean increasing = false;
        int curNum = list.get(0);
        //for(for (int i = 1; i < list.size(); i++) {
        //}
        return increasing;
    }

    /**
     * Checks if any values within the ArrayList are repeated anywhere else
     * in the ArrayList
     * @param list
     * @return true if any values are repeated, false otherwise
     */
    public static boolean hasDuplicates(ArrayList<String> list) {
        return true;
    }

    /**
     * Creates a new ArrayList of Strings that is equal to the original ArrayList
     * in reverse order.  Original ArrayList is unchanged.
     * @param list
     * @return new ArrayList of Strings in reverse order
     */
    //public static ArrayList<String> revArrayList(ArrayList<String> list) {

    //}

    /**
     * Shifts all values in list to the Left and the value at index 0 is moved
     * to index list.size() - 1.
     * @param list
     */
    public static void shiftLeft(ArrayList<String> list) {

    }

}
