package begennerjava;

public class Array_Output_1 {
    public static void main(String[] args) {
        int[][] number = new int[4][5];
        int k = 0;
        
        //assign value 2d dimentional
        for (int row = 0; row < number.length; row++) {
            for (int col = 0; col < 5; col++) {
                number[row][col] = k;
                k++;
            }
        }
        
        
        //print the elements
        for (int row = 0; row < number.length; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(" "+number[row][col]);
            }
            System.out.println("\n");
        }
    }
  
}
