package begennerjava;

import java.util.Scanner;

public class Pattern_2 {
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter line(row or column) number : ");
        int n = input.nextInt();//n is row and column
        
        for (int row = n; row >= 1; row--) {
            //for (int col = 1; col <= col; col++) {//wrong <=col
            for (int col = 1; col <= row; col++) {
                System.out.print(" "+col);
                //System.out.print("*");
                //System.out.print("#");
                //System.out.print("7");
            }
            System.out.println("");
        }
    } 
}
