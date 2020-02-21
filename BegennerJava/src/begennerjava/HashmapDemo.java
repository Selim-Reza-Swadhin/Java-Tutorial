package begennerjava;

import java.util.HashMap;

public class HashmapDemo {

    public static void main(String[] args) {
        //HashMap means key-value working
        //ArrayList<Integer> number = new ArrayList<Integer>(array size);//Right

        HashMap<Integer, String> customer = new HashMap<Integer, String>();
        
        customer.put(101, "Selim");//put() -> insert data
        customer.put(102, "Reza");
        customer.put(103, "Swadhin");
        
        System.out.println(customer.get(101));//get() -> get data
        System.out.println(customer.get(102));
        System.out.println(customer.get(103));
    }
}
