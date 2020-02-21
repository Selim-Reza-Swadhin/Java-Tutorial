package begennerjava;

import java.util.Scanner;

public class BitwiseOperator {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter Two  binary number = ");

        a = inp.nextInt();
        b = inp.nextInt();

//        int a = 32;
//        int b = 12;
//        int c;
        c = a & b;
        System.out.println("a & b = " + c);

        c = a | b;
        System.out.println("a | b = " + c);

        c = a ^ b;
        System.out.println("a ^ b = " + c);

        //shift right >> means 2 dara div kora
        c = a >> 3;//a >> 3 means 2 dara 3 bar div kora
        //c = a >> b;
        System.out.println("a >> b = " + c);

        //shift left << means 2 dara * kora
        c = a << 3;//a << 3 means 2 dara 3 bar * kora
        //c = a << b;
        System.out.println("a << b = " + c);
    }

}
