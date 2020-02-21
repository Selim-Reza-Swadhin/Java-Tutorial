package begennerjava;

import java.util.ArrayList;

public class ArrayList_3 {
    public static void main(String[] args) {
         ArrayList<Integer> number1 = new ArrayList<Integer>();
         ArrayList<Integer> number2 = new ArrayList<>();
         ArrayList<Integer> number3 = new ArrayList<>();
        
        //Array elements
        number1.add(10);
        number1.add(20);
        number1.add(30);
        number1.add(40);
        
        System.out.println(number1);
        
        //Array elements
        number2.add(1);
        number2.add(2);
        number2.add(3);
        number2.add(4);
        System.out.println(number2);
        
        number3.addAll(number1);
        System.out.println("number3 "+number3);
        
        
        //boolean t = number3.equals(number1);
        //System.out.println("number3 == number1 :  "+t);
        
        
        boolean f = number2.equals(number1);
        System.out.println("number2 == number1 : "+f);
    }
}
