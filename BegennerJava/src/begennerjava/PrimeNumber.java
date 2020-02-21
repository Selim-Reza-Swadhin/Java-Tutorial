package begennerjava;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any positive integer number : ");
        int num = input.nextInt();
        int count = 0;

//        for (int i = 2; i < num; i++) {

//            if (num % i == 0) {
//                System.out.println("Not prime number");
//                break;
//            } else if (num % i == 1) {
//                System.out.println("Yes prime number");
//                break;
//            } else {
//                System.out.println("Try again");
//            }
//        }
        
        
        for (int i = 2; i < num; i++) {
             if (num % i == 0) {
                count++;
                break;
            }
        }
        
        if (count == 0) {
            System.out.println("Yes Prime Number is " + num);
        } else {
            System.out.println("Not Prime Number is " + num);

        }
        
    }

}
