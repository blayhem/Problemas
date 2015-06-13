package Pac;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * Created by blayhem on 2/6/15.
 */
public class Pacopies_v2 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la longitud del pacopiés en 'pacos' (del 1 al 9)");
        //int l = Integer.parseInt(sc.next().charAt(0)+"");
        int l=0;
        PrintWriter writer = new PrintWriter("pacopies.txt", "UTF-8");

        if(sc.hasNextInt()) l = sc.nextInt();
        writer.println(". .╚⊙ ⊙╝..");
        for (int i = 0; i < l; i++) {
            writer.println("╚═(Paco)═╝\n" +
                    ".╚═(Paco)═╝\n" +
                    "..╚═(Paco)═╝\n" +
                    "...╚═(Paco)═╝\n" +
                    "...╚═(Paco)═╝\n" +
                    "..╚═(Paco)═╝\n" +
                    ".╚═(Paco)═╝\n" +
                    "╚═(Paco)═╝");
        }
        writer.println("═(Paco)═╝\n" +
                ".╚═(Paco)═╝\n" +
                "..╚═(Paco)═╝\n" +
                "...╚═(Paco)═╝\n" +
                ".... ╚═(█)═╝");
    }
}
