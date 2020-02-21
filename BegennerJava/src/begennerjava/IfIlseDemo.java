package begennerjava;

import java.util.Scanner;

public class IfIlseDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter any integer : ");
        num = input.nextInt();

        if (num > 0) {
            System.out.println("Result is positive number = " + num);
        } else if (num < 0) {
            System.out.println("Result is nagetive number = " + num);
        } else {
            System.out.println("Result is Zero number = " + num);
        }
    }
}
