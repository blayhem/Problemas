import java.util.List;
import java.util.ArrayList;

/**
 * Created by blayhem on 24/06/15.
 */
public class SqInRect {
    public static ArrayList<Integer> squares = new ArrayList<Integer>();
    public static List<Integer> sqInRect(int lng, int wdth) {
        squares.clear();
        while (lng != wdth) {
            if (lng > wdth) {
                squares.add(wdth);
                wdth = lng - wdth;
                lng = lng - wdth;
            } else if (lng < wdth) {
                squares.add(lng);
                lng = wdth - lng;
                wdth = wdth - lng;
            }
        }
        if (squares.size() == 0) return null;
        else{
            squares.add(lng);
            return squares;
        }
    }
}
