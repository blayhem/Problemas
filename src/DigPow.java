import java.util.Stack;

/**
 * Created by blayhem on 24/06/15.
 */
public class DigPow {
    public static long digPow(int n, int p) {
        Stack<Integer> number = new Stack<>();
        long num = n, sum = 0, size;
        while(n>0){
            number.push(n%10);
            n = n/10;
        }
        size = number.size();
        for (int i = 0; i < size; i++) {sum += Math.pow(number.pop(),(p+i));}
        if(sum % num == 0) return (sum / num);
        else return -1;
    }
}

/*
Given a positive integer n written as abcd... (a, b, c, d... being digits)
and a positive integer p
we want to find a positive integer k, such as the sum of the digits of n taken to the successive powers of p is equal to k * n.

(a ^ p + b ^ (p+1) + c ^(p+2) + d ^ (p+3) + ...) = n * k
If it is the case we will return k, if not return -1.   IMPORTANT THIS
 */