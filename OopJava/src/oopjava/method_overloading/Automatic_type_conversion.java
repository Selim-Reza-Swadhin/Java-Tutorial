package oopjava.method_overloading;

public class Automatic_type_conversion {
    
  void add(double a, double b){//method name and parameter ke eksathe. add(double a, double b)=> said method signature
      System.out.println(a+b); 
  } 
  
    public static void main(String[] args) {
        Automatic_type_conversion obj = new Automatic_type_conversion();
        //obj.add(5,10);//Automatic type conversion
        obj.add(5.6,10);//Automatic type conversion
        //obj.add(3.4, 6.2);
    }
}
