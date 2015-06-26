import java.util.Stack;

/**
 * Created by blayhem on 26/06/15.
 */
public class Groups {
    public static boolean groupCheck(String s){
        char[] array = s.toCharArray();
        Stack<Character> aux = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            if(array[i] == '(' || array[i] == '[' || array[i] == '{') aux.push(array[i]);
            if(array[i] == ')' && aux.peek() == '(') aux.pop();
            if(array[i] == ']' && aux.peek() == '[') aux.pop();
            if(array[i] == '}' && aux.peek() == '{') aux.pop();
        }
        return aux.isEmpty();
    }
}
