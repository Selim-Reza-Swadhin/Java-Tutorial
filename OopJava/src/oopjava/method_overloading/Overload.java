package oopjava.method_overloading;

public class Overload {
  void add(int a, int b){//method name and parameter ke eksathe. add(int a, int b)=> said method signature
      System.out.println(a+b); 
  } 
  
  void add(double a, double b){//method name and parameter ke eksathe. add(double a, double b)=> said method signature
      System.out.println(a+b); 
  }
  
  void add(int a, int b, int c){
      System.out.println(a+b+c); 
  }
  
  void add(){
      System.out.println("Nothing to add"); 
  } 
  
//    public static void main(String[] args) {
//        Overload obj = new Overload();
//        obj.add(5,10);
//        obj.add(3.4, 6.2);
//        obj.add(5, 10, 20);
//        obj.add();
//    }
  
}
