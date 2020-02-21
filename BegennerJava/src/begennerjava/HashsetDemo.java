package begennerjava;

import java.util.HashSet;

public class HashsetDemo {
    public static void main(String[] args) {
       //ArrayList<Integer> number = new ArrayList<Integer>(array size);//Right
        //HashMap<Integer, String> customer = new HashMap<Integer, String>();
        
        HashSet<String> fruitsName = new HashSet<String>();
        fruitsName.add("banana");
        fruitsName.add("mango");
        fruitsName.add("pineapple");
        fruitsName.add("apple");
        
        System.out.println(fruitsName);
        System.out.println(fruitsName.size());
        System.out.println(fruitsName.size());
        System.out.println(fruitsName.remove("apple"));
        System.out.println(fruitsName);
        fruitsName.clear();
        System.out.println(fruitsName);
        boolean value = fruitsName.isEmpty();
        System.out.println(value);
        
    }
   
}
