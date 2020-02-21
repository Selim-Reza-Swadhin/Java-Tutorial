package begennerjava;

public class Array_2D {

    public static void main(String[] args) {
        //int[][] number = new int[2][];
        int[][] number = new int[2][3];//row[2] and col[3]

        number[0][0] = 10;
        number[0][1] = 20;
        number[0][2] = 30;
        number[1][0] = 40;
        number[1][1] = 50;
        number[1][2] = 60;

        System.out.println(number[0][2]);
        System.out.println(number[1][2]);

//        for (int row = 0; row < 2; row++) {//row[2]
//            for (int col = 0; col < 3; col++) {//col[3]
//                System.out.print(" "+number[row][col]);
//            }
//            System.out.println();
//        }
        for (int row = 0; row < number.length; row++) {//row[2]
            for (int col = 0; col < 3; col++) {//col[3]
                System.out.print(" " + number[row][col]);
            }
            System.out.println();
        }
    }

}
