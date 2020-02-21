package exception_handling;

import java.io.File;

public class Exception_list {
    //Runtime error who said Exception and error solving who
    //Error is compile time error

    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        //int result = x / y;

        //System.out.println("ArithmaticException : " + result);
        
        //String name = null;
        //System.out.println("NullPointerException : "+name.charAt(0));
        
        //String name = "Anisul";//length is 6
        //System.out.println("StringIndexOutOfBoundsException : "+name.charAt(9));
        
        //int num = Integer.parseInt("anis");
        //System.out.println("NumberFormatException : "+num);
        
        //File file = new File("D://file.ext");
        //System.out.println("FileNotFoundException : "+file);
        
        int a[] = new int[5];
        a[5]=32;
        System.out.println("ArrayIndexOutOfBoundsException : "+a[5]);
        
        //ClassNotFoundException
        //IOException//input output
        //NoSuchMethodException
        //InputMismatchException
    }
}
