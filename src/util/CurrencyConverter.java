package util;

public class CurrencyConverter {

    public static double IOF = 0.06;
    public static double converteDollar(double valueD, double valueQ){
        return valueQ * valueD * (1.0 + IOF);
    }
}
