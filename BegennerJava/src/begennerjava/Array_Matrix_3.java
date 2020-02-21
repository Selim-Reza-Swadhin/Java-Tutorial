package begennerjava;

import java.util.Scanner;

public class Array_Matrix_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[3][3];
        int sunOfDiagonalElements = 0;
        int sunOfUpperElements = 0;
        int sunOfLowerElements = 0;
        System.out.println("Please enter a number : ");

        //Matrix input
        for (int row = 0; row < A.length; row++) {
            for (int col = 0; col < 3; col++) {
                A[row][col] = input.nextInt();
            }
        }

        //diagonal, upper, lower print
        for (int row = 0; row < A.length; row++) {
            for (int col = 0; col < 3; col++) {

                if (row == col) {
                    sunOfDiagonalElements += A[row][col];
                }
                
                if (row < col) {
                    sunOfUpperElements += A[row][col];
                }
                
                if (row > col) {
                    sunOfLowerElements += A[row][col];
                }


            }
        }
        System.out.println("sun Of Diagonal Elements = " + sunOfDiagonalElements);
        System.out.println("sun Of Upper Elements = " + sunOfUpperElements);
        System.out.println("sun Of Lower Elements = " + sunOfLowerElements);
    }

}
