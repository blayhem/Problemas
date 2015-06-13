package Pac;

import java.util.Scanner;

/**
 * Created by blayhem on 2/6/15.
 */
public class Pacopies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la longitud del pacopiés en 'pacos' (del 1 al 9)");
        //int l = Integer.parseInt(sc.next().charAt(0)+"");
        int l=0;
        if(sc.hasNextInt()) l = sc.nextInt();
        System.out.println(". .╚⊙ ⊙╝..");
        for (int i = 0; i < l; i++) {
            System.out.println("╚═(Paco)═╝\n" +
                    ".╚═(Paco)═╝\n" +
                    "..╚═(Paco)═╝\n" +
                    "...╚═(Paco)═╝\n" +
                    "...╚═(Paco)═╝\n" +
                    "..╚═(Paco)═╝\n" +
                    ".╚═(Paco)═╝\n" +
                    "╚═(Paco)═╝");
        }
        System.out.println("═(Paco)═╝\n" +
                ".╚═(Paco)═╝\n" +
                "..╚═(Paco)═╝\n" +
                "...╚═(Paco)═╝\n" +
                ".... ╚═(█)═╝");
    }
}
