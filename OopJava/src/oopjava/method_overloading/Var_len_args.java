package oopjava.method_overloading;

public class Var_len_args {
    
//   void add(int num1, int num2){
//       System.out.println(num1+num2);
//   }
//   void add(int num1, int num2, int num3){
//       System.out.println(num1+num2);
//   }
//   void add(int num1, int num2, int num3, int num4){
//       System.out.println(num1+num2);
//   }
   
   
   //Start Variable length arguments
     void add(int ...num){
         int sum = 0;
         for (int x : num) {
             //sum = sum + x;
             sum += x;
         }
             System.out.println("Variable length arguments = "+sum); 
   }
    
    public static void main(String[] args) {
        Var_len_args obj = new Var_len_args();
        obj.add(2, 4);
        obj.add(2, 4, 5);
        obj.add(2, 4, 5, 6);
    }
}
