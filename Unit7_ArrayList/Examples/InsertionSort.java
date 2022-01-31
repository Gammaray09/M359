package Unit7_ArrayList.Examples;



import java.util.ArrayList;

public class InsertionSort {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(3);
        arr.add(4);
        arr.add(1);
        arr.add(6);
        arr.add(4);
       /* for (int i = 0; i < 100000; i++) {
            int num = (int)(Math.random() * 500);
            arr.add(num);
            //System.out.println(num);
        }*/
        long preTime = System.nanoTime();
        long preMilli = System.currentTimeMillis();
        insertionSort(arr);
        long postTime = System.nanoTime();
        long postMilli = System.currentTimeMillis();
        //System.out.println(arr);
        System.out.println("Time took to sort in nano: " + (postTime - preTime));
        System.out.println("Time took to sort in Milli: " + (postMilli - preMilli));
    }

    public static void insertionSort(ArrayList<Integer> list){
        for (int i = 1; i < list.size(); i++) {
            int temp = list.get(i);
            int position = i;
            while (position > 0 && list.get(position-1) > temp){
                list.set(position, list.get(position-1));
                position -= 1;
            }
            list.set(position,temp);
        }
    }
}
