/**
 * Created by blayhem on 10/07/15.
 */
public class Pizza {
    public static int  maxPizza(int cuts) {
        if(cuts < 0) return -1;
        if(cuts == 0) return 1;
        else return ( (int)Math.pow(cuts,2) + cuts + 2 ) / 2;
    }
}
