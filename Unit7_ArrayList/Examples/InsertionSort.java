package Unit7_ArrayList.Examples;

import Unit7_ArrayList.Lab.Show;

import java.util.ArrayList;

public class InsertionSort {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(5);
        arr.add(3);
        arr.add(4);
        arr.add(1);
        arr.add(6);
        arr.add(2);
        insertionSort(arr);
        System.out.println(arr);
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
