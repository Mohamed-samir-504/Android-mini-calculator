package mooc.vandy.java4android.calculator.logic;



import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    
    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out) {
        mOut = out;
        
    }

    //operations
    private static final int ADDITION = 1;
    private static final int SUBTRACTION = 2;
    private static final int MULTIPLICATION = 3;


    

    /**
     * Perform the operation on argumentOne and argumentTwo.
     */
    public void process(int argumentOne, int argumentTwo, int operation) {
        //in each case an object of the operation class is created

        if(operation == ADDITION){
            Add result = new Add(argumentOne,argumentTwo);
            mOut.print(String.valueOf(result.add()));
        }
        else if(operation == SUBTRACTION ){
            Subtract result = new Subtract(argumentOne,argumentTwo);
            mOut.print(String.valueOf(result.sub()));
        }


        else if(operation == MULTIPLICATION){
            Multiply result = new Multiply(argumentOne,argumentTwo);
            mOut.print(String.valueOf(result.mull()));
        }
        else{
            //to prevent dividing by zero
            if(argumentTwo == 0)mOut.print("Can't divide by zero");
            else{
                Divide result = new Divide(argumentOne,argumentTwo);
                mOut.print(result.quotient() + " R: " + result.remainder());
            }

        }
        
    }
}
