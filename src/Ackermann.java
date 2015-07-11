/**
 * Created by blayhem on 10/07/15.
 */
public class Ackermann {
    public int Ackermann(int m, int n){
        if(m<0 || n<0) return 0;
        if(m==0) return n+1;
        else if(n==0) return Ackermann(m-1, 1);
        else return Ackermann(m-1, Ackermann(m, n-1));
    }
}

/**
 A(m,n) = n+1                          if m=0
 A(m,n) = A(m-1,1)                     if m>0 , n=0
 A(m,n) = A(m-1,A(m,n-1))              if m,n > 0
*/