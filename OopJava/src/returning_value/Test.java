package returning_value;

public class Test {

    public static void main(String[] args) {
        ReturningValueDemo obj = new ReturningValueDemo();
        obj.square(5);
        System.out.println("Square value is " + obj.square(5));
    }
}
