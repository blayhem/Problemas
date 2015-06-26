import java.util.Arrays;

public class Dubstep {
    public static String SongDecoder (String song){
        char[] original = song.toCharArray();
        String decoded = "";
        for (int i = 0; i < original.length; i++) {
            if(original[i] == 'W' && original[i+1] == 'U' && original[i+2] == 'B'){
                decoded += ' ';
                i += 2;
            }
            else decoded += original[i];
        }
        //removing unnecessary spaces
        while(decoded.contains("  ")){decoded = decoded.replace("  "," ");}
        if(decoded.charAt(0) == ' '){decoded = decoded.substring(1);}
        if(decoded.charAt(decoded.length()-1) == ' '){decoded = decoded.substring(0, decoded.length()-1);}
        return decoded;
    }
}