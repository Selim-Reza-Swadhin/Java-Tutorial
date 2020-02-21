package begennerjava;

public class MathClass {
    public static void main(String[] args) {
        int x = 20;
        int y = 10;
        int z = -12;
        int max = Math.max(x, y);
        
        //System.out.println(Math.max(x, y));
        System.out.println("Maximum number = "+max);
        
        int min = Math.min(x, y);
        System.out.println("Minimum number = "+min);
        
        int absolute = Math.abs(z);
        System.out.println("Absolute number = "+absolute);
        
        double power = Math.pow(x, y);
        System.out.println("x to the power y = "+power);
        
        float round = Math.round(12.6f);
        System.out.println(round);
        
        float rounnd = Math.round(12.4f);
        System.out.println(rounnd);
        
        System.out.println(Math.PI);
        
        System.out.println(Math.E);
    }
 
}
