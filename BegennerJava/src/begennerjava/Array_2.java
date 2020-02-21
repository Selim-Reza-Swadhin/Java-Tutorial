package begennerjava;

import java.util.Scanner;

public class Array_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] number = new double[5];
        double sum = 0;

        System.out.print("Please enter 5 numbers : ");

        //number[0] = input.nextDouble();
        //number[1] = input.nextDouble();
        //number[2] = input.nextDouble();
        //number[3] = input.nextDouble();
        //number[4] = input.nextDouble();
        //sum = number[0]+number[1]+number[2]+number[3]+number[4];
        //System.out.println(number[0]+number[1]+number[2]+number[3]+number[4]);
        //System.out.println("The sum is "+sum);
        //for input loop
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextDouble();
        }

        //for print loop
        for (int i = 0; i < number.length; i++) {
            sum += number[i];
        }
        System.out.println("I am for loop sum " + sum);
        System.out.println("I am for loop in average " + sum / (number.length));
        
        //max number
        double max = number[0];
        double min = number[0];
        for (int i = 1; i < number.length; i++) {
            
            if (max < number[i]) {
                max = number[i];
            }
            
            if (min > number[i]) {
                min = number[i];
            }
        }
        System.out.println("Maximum number is "+max);
        System.out.println("Minimum number is "+min);

    }

}
