package exception_handling;

public class Exception_handle {

    public static void main(String[] args) {

//        try {
//            int x = 10;
//            int y = 0;
//            int result = x / y;
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Exception : " + e);
//
//        } catch (StringIndexOutOfBoundsException e) {
//            System.out.println("Exception : " + e);
//        } catch (ArithmeticException e) {
//            System.out.println("Exception : " + e);
//        } finally {
//            System.out.println("Final code of the Exception");
//        }
        try {
            int x = 10;
            int y = 0;
            //int result = x / y;

            int a[] = new int[5];
            a[5] = 32;
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("Exception : " + e1);

        } catch (StringIndexOutOfBoundsException e2) {
            System.out.println("Exception : " + e2);
        } catch (NullPointerException e3) {
            System.out.println("Exception : " + e3);
        } catch (Exception e4) {
            System.out.println("Exception : " + e4);
        } finally {
            System.out.println("Final code of the Exception");
        }

        System.out.println("Last line of the Exception");

    }

}
