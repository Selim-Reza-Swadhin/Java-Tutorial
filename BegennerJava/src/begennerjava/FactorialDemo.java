package begennerjava;

import java.util.Scanner;

public class FactorialDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, fact = 1;
        System.out.print("Enter any integer number = ");
        num = input.nextInt();

        for (int i = num; i >= 1; i--) {
            fact *= i;
            //System.out.println("Your factorial number = "+fact);
        }
        System.out.println("Your factorial number " + num + "!" + " = " + fact);
    }

}
