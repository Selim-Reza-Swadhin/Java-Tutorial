package static_var;

public class StaticMethod_restriction {

    static int x = 10;
    void display() {
        display2();
        System.out.println("I am non static method");
    }

    static void display2() {
        //display();//non static
        System.out.println("static var "+x);
        System.out.println("I am static method");
    }
}
