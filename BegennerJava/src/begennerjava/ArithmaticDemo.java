package begennerjava;

import java.util.Scanner;

public class ArithmaticDemo {

    public static void main(String[] args) {
//        int num1, num2, result;

//        num1 = 20;
//        num2 = 10;
//        result = num1 + num2;
//        System.out.println("Sum = "+result);
//        
//        result = num1 - num2;
//        System.out.println("Sub = "+result);
//        
//        result = num1 * num2;
//        System.out.println("Multi = "+result);
//        
//        result = num1 / num2;
//        System.out.println("Div = "+result);
//        
//        result = num1 % num2;
//        System.out.println("Remainder = "+result);
// From user input
        Scanner user_input = new Scanner(System.in);
        int num1, num2, result;

        System.out.print("Enter first number : ");
        num1 = user_input.nextInt();

        System.out.print("Enter secound number : ");
        num2 = user_input.nextInt();

        result = num1 + num2;
        System.out.println("Sum = " + result);

        result = num1 - num2;
        System.out.println("Sub = " + result);

        result = num1 * num2;
        System.out.println("Multi = " + result);

        result = num1 / num2;
        System.out.println("Div = " + result);

        double result2 = (double) num1 / num2;//type casting
        System.out.println("Div2 = " + result2);

        double result3 = num1 / (double) num2;
        System.out.println("Div3 = " + result3);

        result = num1 % num2;
        System.out.println("Remainder = " + result);

    }
} 


