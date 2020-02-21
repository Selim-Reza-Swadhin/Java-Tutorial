package begennerjava;

public class DoVsWhile {
    public static void main(String[] args) {
        int x = 6;
        while (x <= 5) {
            System.out.println(x+" Bangladesh");
            x++;            
        }
        //Do vs While
        do {
            System.out.println(x+" Do Bangladesh");
            x++;
        } while (x <= 5);
        
    }
  
}
