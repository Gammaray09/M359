package Unit7_ArrayList.Examples;

public class TryCatch {
    public static void main(String[] args) {
        try {
            //int x = 5/0;
            int[] myNums = {1, 2, 3};
            System.out.println(myNums[7]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("invalid Index");

        }catch(ArithmeticException e){
            System.out.println("Don't divide by zero");
        } catch (Exception e){
            System.out.println("Something went wrong");
        }
    }
}
