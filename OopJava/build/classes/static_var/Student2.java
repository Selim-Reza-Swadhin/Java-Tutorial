package static_var;

public class Student2 {
   //int count = 0;//non static var
   static int count = 0;//static var
   
   Student2(){
       count++;
   }
   
//  void totalStudent(){
//       System.out.println("Total student = "+count);
//   }
  
  static void totalStudent(){
       System.out.println("Total student = "+count);
   }
}
