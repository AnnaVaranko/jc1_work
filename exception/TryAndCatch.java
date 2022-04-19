package exception;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TryAndCatch {

    private static final Logger log = Logger.getLogger("TryAndCatch");

    public double divide(Integer a, Integer b){
        return a/b;
    }

    public void doTryCatch(Integer a, Integer b){
        try {
            System.out.println(divide(a,b));
        } catch (Exception e){
            System.out.println("Catch " + e);
            //e.printStackTrace();
            log.log(Level.WARNING, "Please check input", e);
        }
    }

    public static void main(String[] args) {
        try{
            new TryAndCatch().doTryCatch(1, 0);
        }catch (Exception e){
            //Hide Exception !!!!!!!!!!!!!!  VERY VERY BAD  !!!!!!!!!!!!!!
            System.out.println("ERROR: " + e.getMessage());
        }
        finally {
            System.out.println("Finish");
        }
    }
}
