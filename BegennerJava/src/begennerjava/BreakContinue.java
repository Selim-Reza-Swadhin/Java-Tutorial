package begennerjava;

public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
//            if (i == 5) {
//                break;
//            }
            
//            if (i >= 5) 
//                break;
//            

            if (i == 5) //{}missing
                continue;
            
            System.out.println(i);
        }
    }
  
}
