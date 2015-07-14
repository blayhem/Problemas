/**
 * Created by blayhem on 14/07/15.
 */
public class Banjo {
    public static String areYouPlayingBanjo(String name) {
        if((name.charAt(0)+"").compareToIgnoreCase("r") == 0) return name+" plays banjo";
        else return name + " does not play banjo";
    }
}

