package begennerjava;

import java.text.DecimalFormat;

public class DecimalNumberFormat {
    public static void main(String[] args) {
        double y = 2.9875488;
        System.out.printf("x = %.2f", y);
        System.out.printf("\n");
        
        //DecimalFormat decimalFormat = new DecimalFormat("0.00");
        DecimalFormat decimalFormat = new DecimalFormat("0.000");
        double x = 2.9875488;
        System.out.println("x = "+decimalFormat.format(x));
    }
 
}
