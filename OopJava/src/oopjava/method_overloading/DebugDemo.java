package oopjava.method_overloading;

public class DebugDemo {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            //sum = sum + i;
            sum += i;
        }
        System.out.println("Sum is "+sum);
    }
  
}
