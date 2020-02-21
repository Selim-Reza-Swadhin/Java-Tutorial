package begennerjava;

import java.util.Scanner;

public class Decimal_to_Binary_Octal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int intPut;
        System.out.println("Enter your any integer number :");
        intPut = input.nextInt();
        
        //int decimal = 15;
        String binary = Integer.toBinaryString(intPut);
        System.out.println("Binary to decimal "+binary);
        
        //int deci = 15;
        String octal = Integer.toOctalString(intPut);
        System.out.println("Octal to decimal "+octal);
        
        //int decim = 15;
        String hexa = Integer.toHexString(intPut);
        System.out.println("Hexadecimal to decimal "+hexa);
    }
 
}
