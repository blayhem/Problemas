/**
 * Created by blayhem on 24/06/15.
 */
public class BuyCar {
    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
        double savings=startPriceOld, price=startPriceNew;
        int increment, month=0;
        while(savings<price){
            month++;
            increment = (month) / 2;
            savings = startPriceOld*(1 - (percentLossByMonth/100)*month - 0.005*increment) + savingperMonth*month;
            price = startPriceNew * (1 - (percentLossByMonth/100)*month - 0.005*increment);
        }
        return new int[]{month, (int) (savings - price)};
    }
}

/*
parameter (positive int, guaranteed) startPriceOld (Old car price)
parameter (positive int, guaranteed) startPriceNew (New car price)
parameter (positive int, guaranteed) savingperMonth
parameter (positive float, guaranteed) percentLossByMonth

nbMonths(2000, 8000, 1000, 1.5) should return [6, 766]
parameter months
parameter money left
 */

/*
        int startPriceOld = 2000;
        int startPriceNew = 8000;
        int savingperMonth = 1000;
        double percentLossByMonth = 1.5;

        double savings=startPriceOld, price=startPriceNew;
        int increment, month=0;
        while(savings<price){
            month++;
            increment = (month) / 2;
            savings = startPriceOld*(1 - (percentLossByMonth/100)*month - 0.005*increment) + savingperMonth*month;
            price = startPriceNew * (1 - (percentLossByMonth/100)*month - 0.005*increment);
        }
        System.out.println("Savings: "+savings+", price: "+price+". Total: "+(savings-price));
 */