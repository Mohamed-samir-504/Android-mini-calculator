package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract {
    private int arg1;
    private int arg2;

    public Subtract(int a, int b){
        arg1 = a;
        arg2 = b;
    }

    public int sub(){
        return arg1 - arg2;
    }
}
