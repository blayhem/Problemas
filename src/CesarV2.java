import java.util.Scanner;
import java.util.Stack;

/**
 * Created by blayhem on 26/03/15.
 */
public class CesarV2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phrase="";
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> answer = new Stack<>();
        boolean end = false;
        int header,key; char[]operachar;

        while(!end){
            phrase = sc.nextLine();
            header = phrase.charAt(0);
            operachar=phrase.toCharArray();

            if(header==112)stack.push(vocalCount(phrase)); // only vocal count

            else if(header>96 && header<123){   //only valid for minus keys
                if(header<112) key = 112-header;
                else key = -(header-112);       //calculate the key pass
                for (int i = 0; i < operachar.length; i++) {
                    header=operachar[i];
                    if(header>64 && header<91){ //mays
                        header=header+key;
                        if(header>64 && header<91)operachar[i]=(char)header;
                        else if(header<65) operachar[i]=(char)(header+26);
                        else operachar[i]=(char)(header-26);
                    }
                    else if(header>96 && header<123){   //minus
                        header=header+key;
                        if(header>96 && header<123)operachar[i]=(char)header;
                        else if(header<97) operachar[i]=(char)(header+26);
                        else operachar[i]=(char)(header-26);
                    }
                }

                phrase=""; //get decrypted phrase
                for (int i = 0; i < operachar.length; i++)phrase=phrase+operachar[i];
                if(phrase.equals("pFIN"))end=true;
                //vocal count
                else stack.push(vocalCount(phrase));
            }

            else{
                System.out.println("Invalid entry. Check first character");
                stack.push(0);
            }
        }
        int size=stack.size();
        for (int i = 0; i < size; i++) answer.push(stack.pop());
        for (int i = 0; i < size; i++) System.out.println(answer.pop());
    }

    public static int vocalCount(String input){
        int vocals=0;
        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)){
                case'a':case'A':case'e':case'E':case'i':case'I':case'o':case'O':case'u':case'U':
                    vocals++;
                    break;
                default:break;
            }
        }
        return vocals;
    }
}
