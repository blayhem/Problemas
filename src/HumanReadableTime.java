/**
 * Created by blayhem on 11/07/15.
 */
public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        String format = "";
        for (int i = 0; i < 2; i++) {
            if((seconds % 60) / 10 == 0) format = ":0" + Integer.toString(seconds%60) + format;
            else format = ":" + Integer.toString(seconds%60) + format;
            seconds /= 60;
        }
        if(seconds / 10 == 0) format = "0" + Integer.toString(seconds) + format;
        else format = Integer.toString(seconds) + format;
        return format;
    }
}