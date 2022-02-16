package Unit8_2DArrays.Examples;

public class MethodWritingPractice {
    public static void main(String[] args) {
        int[][] myNums = { {9,7,25,3},
                        {29,8,22,10},
                        {19,16,9,1}};

        showArray(myNums);

        double avg = getAvg(myNums);
        System.out.println("Average: " + avg);

        int evenCount = getEvenRowCount(myNums);
        System.out.println("# of rows that contain an even #:" + evenCount);

        int colEvenCount = getEvenColCount(myNums);
        System.out.println("# of col that contain an even #:"+ colEvenCount);
    }

    public static void showArray(int[][] arr){
        for(int[] row: arr){
            for(int num:row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static double getAvg(int[][] arr){
        int total = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                count++;
                total += arr[i][j];
            }
        }
        return (double)total/count;
    }



    public static int getEvenRowCount(int[][] arr){
        int count = 0;
        for(int[] row: arr){
            for(int num:row){
                if(num % 2 == 0){
                    count++;
                    break;
                }
            }
        }
        return count;
    }


    public static int getEvenColCount(int[][] arr){
        int count = 0;
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j][i] % 2 == 0){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
