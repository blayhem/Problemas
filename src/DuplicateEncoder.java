/**
 * Created by blayhem on 17/07/15.
 */
public class DuplicateEncoder {
    static String encode(String word){
        String encoded = "";
        boolean repeated;
        for (int i = 0; i < word.length(); i++) {
            repeated = false;
            for (int j = 0; j < word.length(); j++) {
                if(i!=j &&
                        ((word.charAt(i)+"").compareToIgnoreCase(word.charAt(j)+"") == 0)
                        ) repeated = true;
            }
            if(repeated) encoded += ")";
            else encoded += "(";
        }
        return encoded;
    }
}

