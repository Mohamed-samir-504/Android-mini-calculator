package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply {
    private int arg1;
    private int arg2;

    //public constructor

    public Multiply(int a, int b){
        arg1 = a;
        arg2 = b;
    }

    //performs multiplication
    public int mull(){
        return arg1 * arg2;
    }
}
