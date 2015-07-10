/**
 * Created by blayhem on 10/07/15.
 */
public class TriangleNumbers {

    public static Boolean isTriangleNumber(long number) {
        for (long i = 1; i < number || number > 0; i++) {
            number-=i;
            if(number == 0) return true;
        }
        return false;
    }
}

