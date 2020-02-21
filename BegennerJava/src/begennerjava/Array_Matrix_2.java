package begennerjava;

import java.util.Scanner;

public class Array_Matrix_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter elements for A matrix number : ");

        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        int[][] C = new int[2][3];

        //getting input for A matrix
        for (int row = 0; row < A.length; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf(" A[%d][%d] = ", row, col);
                A[row][col] = input.nextInt();
            }
        }

        /*=======================================================*/
        System.out.println("Enter elements for B matrix number : ");
        //getting input for B matrix
        for (int row = 0; row < A.length; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf(" B[%d][%d] = ", row, col);
                B[row][col] = input.nextInt();
            }
        }

        /*==========================================================================*/
        //printing A matrix
        System.out.println("A = ");
        for (int row = 0; row < A.length; row++) {
            for (int col = 0; col < 3; col++) {
                //System.out.printf(" A[%d][%d] = ",row,col);
                System.out.print("\t " + A[row][col]);
            }
            System.out.println();
        }

        //printing B matrix
        System.out.println("\n");
        System.out.println("B = ");
        for (int row = 0; row < A.length; row++) {
            for (int col = 0; col < 3; col++) {
                //System.out.printf(" B[%d][%d] = ",row,col);
                System.out.print("\t " + B[row][col]);
            }
            System.out.println();
        }

        //Adding A and B matrix = A+B
        System.out.print("\n");
        System.out.print("A + B = ");
        System.out.print("\n");
//        for (int row = 0; row < A.length; row++) {
//            for (int col = 0; col < 3; col++) {
//                System.out.print("\t " + (A[row][col] + B[row][col]));
//            }
//            System.out.println();
//        }

        for (int row = 0; row < A.length; row++) {
            for (int col = 0; col < 3; col++) {
                C[row][col] = A[row][col] + B[row][col];
                System.out.print("\t " + C[row][col]);
            }
            System.out.println();
        }
        
        
       //Adding A and B matrix = A-B
        System.out.print("\n");
        System.out.print("A - B = ");
        System.out.print("\n");
        for (int row = 0; row < A.length; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t " + (A[row][col] - B[row][col]));
            }
            System.out.println();
        }
        
        //Adding A and B matrix = A*B
        System.out.print("\n");
        System.out.print("A * B = ");
        System.out.print("\n");
        for (int row = 0; row < A.length; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t " + (A[row][col] * B[row][col]));
            }
            System.out.println();
        }
        
        //Adding A and B matrix = A/B
        System.out.print("\n");
        System.out.print("A / B = ");
        System.out.print("\n");
        for (int row = 0; row < A.length; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t " + (A[row][col] / B[row][col]));
            }
            System.out.println();
        }

    }

}
