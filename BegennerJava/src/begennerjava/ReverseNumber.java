package begennerjava;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, r, temp, num;
        System.out.print("Enter any reverse number : ");
        num = input.nextInt();
        temp = num;
        while (temp != 0) {
            r = temp % 10;
            sum = sum * 10 + r;
            //temp = temp /10;
            temp /= 10;
        }
        System.out.println("This is reverse number : " + sum);
    }
}
