package oopjava.method_overloading;

public class Test {
      public static void main(String[] args) {
        Overload obj = new Overload();
        obj.add(5,10);
        obj.add(3.4, 6.2);
        obj.add(5, 10, 20);
        obj.add();
    }
}
