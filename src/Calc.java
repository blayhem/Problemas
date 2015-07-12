import java.util.Stack;

/**
 * Created by blayhem on 12/07/15.
 */
public class Calc {
    public double evaluate(String expr) {
        if (expr.isEmpty()) return 0;
        Stack<Double> stack = new Stack<>();
        double buffer;
        String[] chars = expr.split(" ");

        for (int i = 0; i < chars.length; i++) {

            switch (chars[i]){
                case "+": stack.push(stack.pop()+stack.pop()); break;
                case "-":
                    buffer = stack.pop();
                    stack.push(stack.pop()-buffer);
                    break;
                case "*": stack.push(stack.pop()*stack.pop()); break;
                case "/":
                    buffer = stack.pop();
                    stack.push(stack.pop()/buffer);
                    break;
                default:
                    stack.push((double) Float.valueOf(chars[i]));
                    break;
            }
        }
        return stack.pop();
    }
}

/*
Note that for simplicity you may assume that there are always spaces between numbers and operations,
e.g. 1 3 + expression is valid, but 1 3+ isn't.

Empty expression should evaluate to 0.

Valid operations are +, -, *, /.
 */