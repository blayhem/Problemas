import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by blayhem on 14/07/15.
 */
public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        ArrayList<Object> list = new ArrayList<>(Arrays.asList(arr));
        ArrayList<String> directions = new ArrayList<String>();
        for (Object object : list) {directions.add(object != null ? object.toString() : null);}

        boolean found = false;
        for (int i = 0; i < (directions.size()-1); i++) {
            found = false;
            if(directions.get(i).equals("NORTH") && directions.get(i+1).equals("SOUTH")) found = true;
            else if(directions.get(i).equals("SOUTH") && directions.get(i+1).equals("NORTH")) found = true;
            else if(directions.get(i).equals("EAST") && directions.get(i+1).equals("WEST")) found = true;
            else if(directions.get(i).equals("WEST") && directions.get(i+1).equals("EAST")) found = true;
            if (found) {directions.remove(i+1); directions.remove(i);}
        }
        if(!found) return directions.toArray(new String[directions.size()]);
        else return dirReduc(directions.toArray(new String[directions.size()]));
    }
}