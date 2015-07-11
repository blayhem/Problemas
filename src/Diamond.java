/**
 * Created by blayhem on 10/07/15.
 */
public class Diamond {
    public static String print(int n) {
        if(n % 2 == 0 || n < 0) return null;   //only even numbers are valid
        String diamond = "";
        for (int i = 1; i <= (n /2) + 1; i++) {
            for (int j = 0; j < (n / 2) - i + 1; j++)
                //System.out.printf(" ");
                diamond+=" ";
            for (int j = 0; j < (i*2) - 1; j++)
                //System.out.printf("*");
                diamond+="*";
            //for (int j = 0; j < (n / 2) - i + 1; j++) System.out.printf(" ");
            //System.out.printf("\n");
            diamond+="\n";
        }
        for (int i = n / 2; i > 0; i--) {
            for (int j = 0; j < (n / 2) - i + 1; j++)
                //System.out.printf(" ");
                diamond+=" ";
            for (int j = 0; j < (i*2) - 1; j++)
                //System.out.printf("*");
                diamond+="*";
            //for (int j = 0; j < (n / 2) - i + 1; j++) System.out.printf(" ");
            //System.out.printf("\n");
            diamond+="\n";
        }
        return diamond;
    }

    public static void main(String[] args) {
        print(7);
    }

}