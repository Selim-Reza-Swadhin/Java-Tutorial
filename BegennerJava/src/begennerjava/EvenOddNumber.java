package begennerjava;

import java.util.Scanner;

public class EvenOddNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter any integer number : ");
        num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("Result is Even number = " + num);
        } else if (num % 2 == 1) {
            System.out.println("Result is Odd number = " + num);
        } else {
            System.out.println("Result is Zero number = " + num);
        }
    }
}
