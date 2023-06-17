
package Model;

/**
 *
 * @author Ahmed
 */
public class ConverterCurrency {
    
     private static final double UsdToIls = 3.50;

    public static double convertToILS(double usd) {
        return usd * UsdToIls;
    }

    public static double convertToUSD(double ils) {
        return ils / UsdToIls;
    }
}
