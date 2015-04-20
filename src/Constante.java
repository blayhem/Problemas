import java.util.Scanner;
import java.util.Stack;
import java.util.Arrays;
/**
 * Created by blayhem on 19/03/15.
 */
public class Constante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        int number=0;int asc=0;int desc=0;int operations=0; //número a operar, ordenado asc, ordenado desc, operaciones hasta 6174
        Stack<Integer> stack = new Stack<>();               //stack para descomponer el número en dígitos
        int repdigit=0;
        int[] ascend = new int[4];                          //array de dígitos ordenada ascendente
        int[] descend = new int[4];
        int[] operIndex = new int[casos];
        for (int i = 0; i < casos; i++) {
            number = sc.nextInt();
            operations=0;
            while (number != 6174) {
                if ((number > 999 && number < 10000)) {
                    while (number > 0) {
                            stack.push(number % 10);          //si no lo metemos en stack, el número sale del revés
                            number = number / 10;             //lo vamos metiendo dígito a dígito
                    }
                    for (int j = 0; j < 4; j++) {
                            if(!stack.isEmpty())descend[j] = stack.pop();   //llenamos ascend con los valores del stack
                    }
                }//else {i = casos;number = 6174;}
                Arrays.sort(descend);                                       //número ordenado en orden ascendente (array)
                for (int j = 0; j < 4; j++) {stack.push(descend[j]);}
                for (int j = 0; j < 4; j++) {ascend[j] = stack.pop();}      //número ordenado descendente (en array)
                asc = 0; desc = 0;
                for (int j = 0; j < 4; j++) {desc *= 10;desc += descend[j];}//  "       "     (individualmente)
                for (int j = 0; j < 4; j++) {asc *= 10;asc += ascend[j];}   //  "       "     (individualmente)
                number = asc - desc;
                operations++;
                for (int n = 0; n < 3; n++) {if(descend[n]==descend[n+1])repdigit++;}
                if (repdigit==3){operations=8;number=6174;}
            }
            operIndex[i]=operations;
        }
        for (int i = 0; i < casos; i++) {System.out.println(operIndex[i]);}
    }
}

