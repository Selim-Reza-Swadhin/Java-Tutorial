package begennerjava;

public class RecursionDemo {
  int fact(int n){
      
      if(n == 1){
          return 1;
      }else{
          return n*fact(n-1);
      }
  } 
  
  
    public static void main(String[] args) {
        RecursionDemo obj = new RecursionDemo();
        System.out.println("Factorial of  = "+obj.fact(5));
        System.out.println("Factorial of  = "+obj.fact(4));
    }
}
