package begennerjava;

public class WrapperClass {
    public static void main(String[] args) {
        //Autoboxing = converting primitive to object
        int x = 30;
        Integer y = Integer.valueOf(x);
        //System.out.println(" "+x);
        //System.out.println("y = "+y);
        
        Integer z = x;//Integer.valueOf(x);//Autoboxing
        System.out.println("Autoboxing z = "+z);
        
        
        //Unboxing = converting object to primitive
        Double d = new Double(10.35);
        System.out.println("d = "+d);
        
        //double e = d.doubleValue();
        double e = d;//d.doubleValue();//Unboxing
        System.out.println("Unboxing e = "+e);
    }
  
}
