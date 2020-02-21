package begennerjava;

public class IncrementDecrement {
    public static void main(String[] args) {
        
        int x = 25;
        int y;
        
        y = x++;
        System.out.println("Postfix increment y = "+y);
        
        y = x;
        System.out.println("Postfix increment y = "+y);
        
        y = ++x;
        y = x;
        System.out.println("Pretfix increment y = "+y);
        
        y = x--;
        y = x;
        System.out.println("Postfix decrement y = "+y);
        y = --x;
        y = x;
        System.out.println("Prefix decrement y = "+y);
    }
 
}
