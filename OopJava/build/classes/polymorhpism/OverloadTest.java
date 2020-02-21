package polymorhpism;

public class OverloadTest {

    public static void main(String[] args) {
        Overload overload = new Overload();
        overload.add();
        overload.add(6.8, 5.5);
        overload.add(5, 10, 20);
    }

}
