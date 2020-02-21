package oopjava;

public class MathDemo {

    public static void main(String[] args) {
        //int x = Math.abs(-9);
        //System.out.println("Absolute = " + x);
        
        
        System.out.println("Absolute = " + Math.abs(-7));
        System.out.println("Square = " + Math.sqrt(25));//return double value
        System.out.println("Power = " + Math.pow(2, 3));
        System.out.println("PI = " + Math.PI);
        System.out.println("Log = " + Math.log(1));
        System.out.println("Exp = " + Math.exp(1.0));
        System.out.println("Max = " + Math.max(-2, -12));
        System.out.println("Min = " + Math.min(-2, -12));
        System.out.println("Ceil = " + Math.ceil(5.6));//up
        System.out.println("Floor = " + Math.floor(5.6));//down
    }

}
