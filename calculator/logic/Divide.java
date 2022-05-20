package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    private int arg1;
    private int arg2;

    //public constructor

    public Divide(int a, int b){
        arg1 = a;
        arg2 = b;
    }

    //calculates the quotient

    public int quotient(){
        return arg1/arg2;

    }

    //calculates the remainder
    public int remainder(){
        return arg1%arg2;
    }
}
