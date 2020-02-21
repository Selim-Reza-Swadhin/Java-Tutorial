package begennerjava;

import java.util.Scanner;

public class PalnidromeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, r, temp, num;
        System.out.print("Enter any palindrome number : ");
        num = input.nextInt();
        temp = num;
        while (temp != 0) {
            r = temp % 10;
            sum = sum * 10 + r;
            //temp = temp /10;
            temp /= 10;
        }

        if (num == sum) {
            System.out.println("This is palindrome number " + sum);
        } else {
            System.out.println("This is not palindrome number " + sum);
        }
        System.out.println("Your input number : " + sum);
    }
}
