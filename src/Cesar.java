import java.util.Scanner;
import java.util.Stack;

/**
 * Created by blayhem on 26/3/15.
 */
public class Cesar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alphaShort="abcdefghijklmnopqrstuvwxyz";
        String alphaLong=alphaShort+alphaShort;
        char[] alphabet = alphaLong.toCharArray();
        //char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String phrase = sc.nextLine(); //toda la línea, incluyendo espacios!
        char[] operaChar = phrase.toCharArray();
        int vocals=0;int index=0;       //ppos = 15
        int increment=0;
        Stack<Integer> stack = new Stack();

        if(phrase.charAt(0)=='p'){
            for (int i = 0; i < phrase.length(); i++) {
                switch (phrase.charAt(i)){
                    case'a':case'A':case'e':case'E':case'i':case'I':case'o':case'O':case'u':case'U':
                        vocals++;
                        break;
                    default:break;
                }
            }
            stack.push(vocals);
        }

        else if(isIn(phrase.charAt(0),alphabet)){
            increment=customIndexOf(operaChar[0],alphabet);
            if(increment<15)increment=15-increment;
            else increment=41-increment;
            for (int i = 0; i < operaChar.length; i++) {         //para cada character
                if(isIn(operaChar[i],alphabet)){
                    index = customIndexOf(operaChar[i],alphabet);   //indice del char en alpha
                    operaChar[i]=alphabet[index+increment];
                }
            }
            for (int i = 0; i < operaChar.length; i++) {
                switch (operaChar[i]){
                    case'a':case'A':case'e':case'E':case'i':case'I':case'o':case'O':case'u':case'U':
                        vocals++;
                        break;
                    default:break;
                }
            }
            stack.push(vocals);
            //String phrase = operaChar.toString pero con elementos, no total.
        }

        else{
            System.out.println("Invalid entry. Check first character");
            stack.push(vocals);
        }

        /*
        System.out.println(index);
        System.out.println(customIndexOf('k',alphabet));
        System.out.println(increment);
        System.out.println(operaChar);
        */
        System.out.println(vocals);
        System.out.println(operaChar);
        System.out.println((char) 120); //(65-90, 97-122) ascii
    }

    public static boolean isIn(char letter,char[] alpha){
        for (int i = 0; i < alpha.length; i++) {
            if(alpha[i]==letter)return true;
        }
        return false;
    }

    public static int customIndexOf (char letter,char[] alpha){
        int index=0;
        for (int i = 0; i < alpha.length; i++) {
            if(letter==alpha[i]){
                i=alpha.length;
                index--;
            }
            index++;
        }
        return index;
    }
}
