package exception_handling;

import java.util.Scanner;

public class Pro_solving {

    public static void main(String[] args) {
//        while (true) {
//            try {
//                Scanner input = new Scanner(System.in);
//                System.out.print("Please enter num1 : ");
//                int num1 = input.nextInt();
//
//                System.out.print("Please enter num2 : ");
//                int num2 = input.nextInt();
//
//                int result = num1 / num2;
//                System.out.println("Result : " + num1 + "/" + num2 + " = " + result);
//            } catch (Exception e) {//super most Exception
//                System.out.println("Exception : " + e);
//                System.out.println("You must enter integer. please try again!");
//            }
//        }

//==========================================
        int count = 1;
        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("Please enter num1 : ");
                int num1 = input.nextInt();

                System.out.print("Please enter num2 : ");
                int num2 = input.nextInt();

                int result = num1 / num2;
                System.out.println("Result : " + num1 + "/" + num2 + " = " + result);
                count = 2;//change or false
                
            } catch (Exception e) {//super most Exception
                System.out.println("Exception : " + e);
                System.out.println("You must enter integer. please try again!");
            }

        } while (count == 1);

    }

}
