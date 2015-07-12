import java.util.Arrays;
import java.util.List;

/**
 * Created by blayhem on 12/07/15.
 */
public class CaesarCipher {
    public static List<String> movingShift(String s, int shift) {
        char[] m = s.toCharArray();
        int header;

        for (int i = 0; i < m.length; i++) {
            header = m[i];
            if (header > 64 && header < 91) { //mays
                header = header + shift;
                if (header < 65) while (header < 65) header += 26;
                else while (header > 90) header -=  26;
                m[i] = (char) header;
            } else if (header > 96 && header < 123) {   //minus
                header = header + shift;
                if (header < 97) while (header < 97) header += 26;
                else while (header > 122) header -=  26;
                m[i] = (char) header;
            }
            shift++;
        }

        int j;
        String[] splitted = new String[5];

        if(m.length == 66){
            for (int i = 0; i < 4; i++) {
                s = "";j=0;
                while (j < 14) {s += m[j+(i*14)];j++;}
                splitted[i] = s;
            } s="";
            for (int i = 14*4; i < m.length; i++) s+= m[i];
            splitted[4] = s;
        }
        else{
            for (int i = 0; i < 4; i++) {
                s = "";
                j=0;
                while (j < m.length / 4) {
                    s += m[j+(i*(m.length/4))];
                    j++;
                }
                splitted[i] = s;
            } s="";
            for (int i = (m.length/4)*4; i < m.length; i++) s+= m[i];
            splitted[4] = s;
        }

        return Arrays.asList(splitted);
    }

    public static String demovingShift(List<String> s, int shift) {
        String[] s1 = (String[]) s.toArray();
        String message = "";
        for (String aS1 : s1) message += aS1;
        char[] m = message.toCharArray();
        int header;

        for (int i = 0; i < m.length; i++) {
            header = m[i];
            if (header > 64 && header < 91) { //mays
                header = header - shift;
                if (header < 65) while (header < 65) header += 26;
                else while (header > 90) header -=  26;
                m[i] = (char) header;
            } else if (header > 96 && header < 123) {   //minus
                header = header - shift;
                if (header < 97) while (header < 97) header += 26;
                else while (header > 122) header -=  26;
                m[i] = (char) header;
            }
            shift++;
        }
        message = "";
        for (char l : m) message += l;
        return message;
    }

}