package begennerjava;

import java.util.Arrays;

public class Array_Sort {
    public static void main(String[] args) {
        
        int[] number = {10,-3,10,5,25};
        Arrays.sort(number);
        
        for (int i = 0; i < number.length; i++) {
            System.out.print(" "+number[i]);
        }
        
        System.out.print("\n");
        for (int i = 4; i >= 0; i--) {
            System.out.print(" "+number[i]);
        }
        
        //String print
        String[] st = {"selim", "reza", "swadhin"};
        Arrays.sort(st);
        int x = st.length;
        for (int i = 0; i < x ; i++) {
            System.out.print(" "+st[i]);
        }
        
        System.out.println();
        for (int i = 2; i >= 0 ; i--) {
            System.out.print(" "+st[i]);
        }
      
    }
 
}
