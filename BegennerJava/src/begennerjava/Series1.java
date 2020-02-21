package begennerjava;

import java.util.Scanner;

public class Series1 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); 
       int n, sum=0;
        System.out.print("Enter the last number = ");
        n = input.nextInt();
        
       /* //1+2+3+4+......+n
        for (int i = 1; i <= n; i=i+1) {
            System.out.print(i+" ");
            //sum = sum + i;
            sum += i;
        }*/
        
        /*//1+3+5+......+n
        for (int i = 1; i < n; i=i+2) {
            System.out.print(i+" ");
            //sum = sum + i;
            sum += i;
        }*/
        
        /*//2+4+6+......+n
        for (int i = 2; i <= n; i=i+2) {
            System.out.print(i+" ");
            sum += i;
        }*/
        
        /*//1.5+2.5+3.5+......+n
        
        double d, sum = 0;
        System.out.print("Enter the last number = ");
        d = input.nextDouble();
        
        for (double i = 1.5; i <= d; i=i+1) {
            System.out.print(i+" ");
            sum += i;
        }*/
        
        //1^2+2^2+3^2+......+n^2
        for (int i = 1; i <= n; i=i+1) {
            System.out.print(i+"x"+i+" ");
            sum += i*i;
        }
            System.out.println();
            System.out.println(sum);
        
    }
 
}
