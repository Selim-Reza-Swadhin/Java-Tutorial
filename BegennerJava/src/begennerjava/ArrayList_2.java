
package begennerjava;

import java.util.ArrayList;

public class ArrayList_2 {
    public static void main(String[] args) {
          ArrayList<Integer> number = new ArrayList<Integer>();
        
        //Array elements
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3, 40);//add(int i, Integer e)i=index and e=end
        
        
        System.out.print(number);
        System.out.println();
        System.out.println("Array size "+number.size());
        
        //number.clear();
        //System.out.println("Array clear "+number);
        
        //number.clear();
        //boolean x = number.isEmpty();
        //System.out.println("Array list empty "+x);
        
        //boolean c = number.contains(30);
        //System.out.println("Array contains "+c);
        
        
        //System.out.println("Array indexOf "+number.indexOf(40));//position
        
        number.set(3, 45);//replace//3 is position and 45 dara
        System.out.println("Replace "+number);
        
        
        int n = number.get(3);//3 is index number
        System.out.println("index of "+n);
        
        
    }
}
