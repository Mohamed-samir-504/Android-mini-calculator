package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add {
    private int arg1;
    private int arg2;

    //public constructor

    public Add(int a, int b){
        arg1 = a;
        arg2 = b;
    }
    //performs the add operation
    public int add(){
        return arg1 + arg2;
    }
    //ff
}
