/**
 * Created by blayhem on 20/07/15.
 */
public class SpinWords {
    public String spinWords(String sentence) {
        String[] splitted = sentence.split(" ");
        sentence = "";
        for (String split : splitted) {
            if (split.length() > 4) split = new StringBuilder(split).reverse().toString();
            sentence += split+" ";
        }
        return sentence.substring(0, sentence.length()-1);
    }
}