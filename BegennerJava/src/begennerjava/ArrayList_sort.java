package begennerjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayList_sort {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(10);
        number.add(9);
        number.add(-5);
        number.add(6);
        number.add(-3);
        
        System.out.println(" "+number);
        
        //Collections.sort(number);
        //System.out.println(" "+number);
        
        
        //Collections.reverse(number);
        //Collections.reverseOrder((Comparator<T>) number);
        Collections.sort(number, Collections.reverseOrder());
        System.out.println(" "+number);
    }
 
}
