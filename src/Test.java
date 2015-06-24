import java.util.Stack;

/**
 * Created by blayhem on 24/06/15.
 */
public class Test {
    public static void main(String[] args) {
        long n = 695, p = 2;


        Stack<Long> number = new Stack<>();
        long num = n, sum = 0, size;
        while(n>0){
            number.push(n%10);
            n = n/10;
        }
        size = number.size();
        System.out.println(number);
        System.out.println(number.peek());

        for (int i = 0; i < size; i++) {
            System.out.println(sum+" plus "+number.peek()+" to the power of "+(p+i));
            sum += Math.pow(number.pop(),(p+i));
            System.out.println(sum);
        }
        if(sum % num == 0) System.out.println(sum / num);
        else System.out.println(-1);

    }
}
