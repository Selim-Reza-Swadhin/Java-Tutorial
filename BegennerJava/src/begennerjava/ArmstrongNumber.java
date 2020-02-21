package begennerjava;

import java.util.Scanner;

public class ArmstrongNumber {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, r, temp, num;
        System.out.print("Enter any palindrome number : ");
        num = input.nextInt();
        temp = num;
        while (temp != 0) {
            r = temp % 10;
            sum = sum + r*r*r;
            temp /= 10;
        }

        if (num == sum) {
            System.out.println("This is Armstrong number " + sum);
        } else {
            System.out.println("This is not Armstrong number " + sum);
        }
        System.out.println("Your input number : " + num);
    }
}
