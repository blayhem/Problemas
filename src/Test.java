import java.util.Arrays;
import java.util.Stack;

/**
 * Created by blayhem on 24/06/15.
 */
public class Test {
    public static void main(String[] args) {
        String s;
        char[] m = {'1','2','3','4','5','6','7','8','9','a','b','c','d','e'};
        int j = 0;
        String[] splitted = new String[5];

        for (int i = 0; i < 4; i++) {
            s = "";
            j=0;
            while (j < m.length / 4) {
                s += m[j+(i*(m.length/4))];
                j++;
            }
            splitted[i] = s;
        } s="";

        for (int i = (m.length/4)*4; i < m.length; i++) s+= m[i];
        splitted[4] = s;

        System.out.println(Arrays.asList(splitted));
    }
}