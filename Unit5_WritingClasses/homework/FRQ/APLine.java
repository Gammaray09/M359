package Unit5_WritingClasses.homework.FRQ;

public class APLine {
    private int a;
    private int b;
    private int c;

    public APLine(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getSlope() {
        return a/b;
    }

    public boolean isOnLine(int var1, int var2){
        if((a * var1) + (b * var2) + c == 0){
            return true;
        } else {
            return false;
        }
    }
}
