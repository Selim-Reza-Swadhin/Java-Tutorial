package begennerjava;

import java.util.Scanner;

public class Series2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, result = 1;
        System.out.print("Enter the last number = ");
        n = input.nextInt();
        
       /* //1*2*3*4*.........*n
        for (int i = 1; i <= n; i++) {
            System.out.print(i+" ");
            result = result * i;
            result *= i;
        }*/
        
        //1*3*5*.........*n
        for (int i = 1; i <= n; i=i+2) {
            System.out.print(i+" ");
            result *= i;
        }
        System.out.println();
        System.out.println(result);
    }
}
