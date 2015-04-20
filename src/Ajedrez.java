import java.util.*;
/**
 * Created by blayhem on 18/03/15.
 */
public class Ajedrez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long base;                   //número de granos para la primera casilla
        long razon;                  //razón (multiplicador) de una casilla a otra
        long casillas;               //número de casillas
        long end=1;                  //si es 0, terminamos y devolvemos valores
        int soluciones=0;           //número de valores que devolvemos
        ArrayList<Long> list = new ArrayList<>();    //no podemos hacer un array[soluciones] --> ArrayList
        while(end!=0){
            base=sc.nextInt();      //inicializamos base, razon y casillas con valores dados
            razon=sc.nextInt();
            casillas=sc.nextInt();
            end=base+razon+casillas;
            if(end!=0) {
                for (int i = 0; i < casillas-1; i++) {      //casillas-1 porque la casilla inicial cuenta
                    base=base*razon;                        //en la cual base=base
                }
                //base=base-1;      //necesario para mostrar el resultado ya que 2^64 es el límite de long.
                soluciones++;       //lleva la cuenta de los casos que llevamos
                list.add(base);     //añadimos el valor a la lista (arraylist)
            }
        }
        for (int i = 0; i < soluciones; i++) {
            System.out.println(list.get(i));
        }
    }
}
