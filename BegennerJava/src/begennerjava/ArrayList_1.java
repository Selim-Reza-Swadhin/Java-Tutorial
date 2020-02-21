package begennerjava;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_1 {
    public static void main(String[] args) {
        
        //ArrayList<DataType> number = new ArrayList<DataType>();//Wrong
        //ArrayList<> number = new ArrayList<>();//Wrong
        //ArrayList<Integer> number = new ArrayList<Integer>(array size);//Right
        //ArrayList number = new ArrayList();//Right
        
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("Array size "+number.size());
        
        //ArrayList means indexes work
        //Array elements
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3, 40);//add(int i, Integer e)i=index and e=end
        
        
        //System.out.println(number);
        //System.out.println("Array size "+number.size());
        
        
        for(int x : number){
            System.out.print(" "+x);
        }       
        System.out.println();
        System.out.println("Array size "+number.size());
        
        
        //iterator
        Iterator itr = number.iterator();
        while (itr.hasNext()) {
            System.out.println("I am iterator -> "+itr.next());
        }
        
        System.out.println();
        System.out.println("Array size "+number.size());
        
        
        //Remove elements
        //number.remove(2);//position 2
        number.removeAll(number);
        
        System.out.println(number);
        System.out.println();
        System.out.println("Array size "+number.size());
    }
  
}
