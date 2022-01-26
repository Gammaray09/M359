package Unit7_ArrayList.Examples;

import java.util.ArrayList;

public class SelectionSort {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(5);
        arr.add(3);
        arr.add(4);
        arr.add(1);
        arr.add(6);
        arr.add(2);
        SelectionSort(arr);
        System.out.println(arr);
    }

    public static void SelectionSort(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.size() ; j++) {
                if(list.get(minIndex) > list.get(j)){
                    minIndex = j;
                }
                int temp = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, temp);

            }

        }
    }
}
