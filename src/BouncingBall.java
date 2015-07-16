/**
 * Created by blayhem on 16/07/15.
 */
public class BouncingBall {
    static int count = 1;
    public static int bouncingBall(double h, double bounce, double window) {
        if(bounce >= 1 || bounce < 0 || h<= 0 || window >= h) return -1;
        int count = -1;
        while(h > window){
            h *= bounce;
            count+=2;
        }
        return count;
    }
}