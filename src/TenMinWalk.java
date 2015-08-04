import java.util.LinkedList;

/**
 * Created by blayhem on 04/08/15.
 */
public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        if(walk.length != 10) return false;
        else {
            LinkedList<Character> directions = new LinkedList<Character>();
            for (char dir : walk) directions.add(dir);

            boolean found = true;
            while(directions.size()>0 && found){
                for (int i = 0; i < (directions.size()-1); i++) {
                    found = false;
                    if(directions.get(i) == 'n' && directions.get(i+1) == 's') found = true;
                    else if(directions.get(i) == 's' && directions.get(i+1) == 'n') found = true;
                    else if(directions.get(i) == 'e' && directions.get(i+1) == 'w') found = true;
                    else if(directions.get(i) == 'w' && directions.get(i+1) == 'e') found = true;
                    if (found) {directions.remove(i+1); directions.remove(i);}
                }
            }
            return (directions.size() == 0);
        }
    }
}