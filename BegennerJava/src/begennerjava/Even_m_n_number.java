package begennerjava;

import java.util.Scanner;

public class Even_m_n_number {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int m, n;
        System.out.print("Enter initial number : ");
        m = input.nextInt();

        System.out.print("Enter final or end number : ");
        n = input.nextInt();

        for (int i = m; i <= n; i++) {
            //sum = sum + i;

            if (i % 2 == 0) {
                sum = sum + i;
                System.out.println("Even Number = " + i);
            }
        }
        System.out.println(" The num is : " + sum);
    }

}
