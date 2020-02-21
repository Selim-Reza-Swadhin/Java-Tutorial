package finall;

public class Test {

   //final static String name = "America";
   static String name = "America";

    public static void main(String[] args) {
        System.out.println(name);
        if (3 > 2) {
            name = "Canada";
        }
        System.out.println(name);
    }

}
