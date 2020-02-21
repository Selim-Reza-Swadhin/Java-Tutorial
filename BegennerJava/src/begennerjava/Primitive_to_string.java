package begennerjava;

public class Primitive_to_string {
    public static void main(String[] args) {
        
        int i = 100;
        String s = Integer.toString(i);
        System.out.println("Primitive to string "+s);
        
        double d = 100;
        String s1 = Double.toString(d);
        System.out.println("Primitive to string "+s1);
        
        //String to primitive
        String sp = "33";
        //int p = Integer.parseInt(sp);
        //double p1 = Double.parseDouble(sp);
        int j = Integer.valueOf(sp);
        System.out.println("String to primitive "+j);
        
    }
  
}
