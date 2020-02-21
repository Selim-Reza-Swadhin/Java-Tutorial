package begennerjava;

import java.util.Scanner;

public class TernaryConditional {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        int num1, num2, large, small;
        System.out.print("Enter Two number = ");
        num1 = inp.nextInt();
        num2 = inp.nextInt();
        
        large = (num1 > num2) ? num1 : num2;
        small = (num1 < num2) ? num1 : num2;
        
        System.out.println("Large number is = "+large);        
        System.out.println("Small number is = "+small);        
    }
  
}
