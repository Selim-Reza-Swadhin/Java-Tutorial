package begennerjava;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        System.out.print("Enter any multiplication number = ");
        num = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }

//Nexted for loop
        int m, n;
        System.out.print("Enter any Start number = ");
        m = input.nextInt();

        System.out.print("Enter any end number = ");
        n = input.nextInt();

        for (int i = m; i <= n; i++) {

            for (int j = 1; j <= 10; j++) {
                //System.out.println(m + " x " + j + " = " + m * j);//no working loop
                System.out.println(i + " x " + j + " = " + i * j);
            }
            System.out.print("\n\n");
        }
    }

}
