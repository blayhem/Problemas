/**
 * Created by blayhem on 26/06/15.
 */
public class Keypad {
    public static int presses(String phrase) {
        int count = 0;
        for (int i = 0; i < phrase.length(); i++) {
            switch (phrase.charAt(i)){
                case 'A':case 'D':case 'G':case 'J':case 'M':case'P':case'T':case'W':case' ':
                    count++;
                    break;
                case'B':case'E':case'H':case'K':case'N':case'Q':case'U':case'X':
                    count += 2;
                    break;
                case'C':case'F':case'I':case'L':case'O':case'R':case'V':case'Y':
                    count += 3;
                    break;
                default: count += 4; break;
            }
        }
        return count;
    }
}
/*
        ------- ------- -------
        |     | | ABC | | DEF |
        |  1  | |  2  | |  3  |
        ------- ------- -------
        ------- ------- -------
        | GHI | | JKL | | MNO |
        |  4  | |  5  | |  6  |
        ------- ------- -------
        ------- ------- -------
        |PQRS | | TUV | | WXYZ|
        |  7  | |  8  | |  9  |
        ------- ------- -------
        ------- ------- -------
        |     | |space| |     |
        |  *  | |  0  | |  #  |
        ------- ------- -------
*/