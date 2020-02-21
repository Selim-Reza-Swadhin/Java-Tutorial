package begennerjava;

public class AssignmentDemo {
    
    public static void main(String[] args) {
        int x = 3;
        int y = 2;
        
        x+=y; //x = x + y;
        System.out.println("Sum x = "+x);
        
        x-=y; //x = x - y;
        System.out.println("Sub x = "+x);
        
        x*=y; //x = x * y;
        System.out.println("Multi x = "+x);
        x/=y; //x = x / y;
        System.out.println("Div x = "+x);
        
        x%=y; //x = x % y;
        System.out.println("Remainder x = "+x);
    }
 
}
