/**
 * Created by blayhem on 11/07/15.
 */
public class ZerosCount {
    public static int zeros(int n) {
        long factorial = 1;
        int count = 0;
        for (int i = 0; i < n; i++) factorial *= n-i;
        //System.out.println(factorial);
        while(factorial%10 == 0){
            count++;
            factorial /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) if(ZerosCount.zeros(i) == 7) System.out.println(i);
        //System.out.println(Solution.zeros(2));
        //System.out.println(Solution.zeros(24));
    }
}