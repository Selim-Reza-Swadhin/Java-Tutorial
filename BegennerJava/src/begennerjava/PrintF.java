package begennerjava;

public class PrintF {

    public static void main(String[] args) {

        boolean b = true;
        char c = 'a';
        short s = 32677;
        int i = 1234;
        float f = 10.2f;
        double d = 10.2;

        //format specifier 
        System.out.printf(" boolean b = %b", b);//variable value before %(module) and ,(comma) simble use
        System.out.println("");

        System.out.printf(" char c = %c", c);
        System.out.println("");

        System.out.printf(" short s = %d", s);
        System.out.println("");

        System.out.printf(" integer i = %d", i);
        System.out.println("");

        System.out.printf(" float = %f", f);
        System.out.println("");

        System.out.printf(" float = %.1f", f);
        System.out.println("");

        System.out.printf(" float = %.2f", f);
        System.out.println("");

        System.out.printf(" float = %.3f", f);
        System.out.println("");

        System.out.printf(" double d = %f", d);
        System.out.println("");

    }
}
