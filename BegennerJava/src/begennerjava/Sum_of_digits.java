package begennerjava;

import java.util.Scanner;

public class Sum_of_digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, r, temp, num;
        System.out.print("Enter any number : ");
        num = input.nextInt();
        temp = num;
        while (temp != 0) {
            r = temp % 10;
            sum = sum + r;
            //temp = temp /10;
            temp /=10;
        }
        System.out.println("sum of ditis : "+sum);
    }
}
