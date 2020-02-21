package abstractionn;

public class AbsTest {
    public static void main(String[] args) {
        //MobileUser ms = new MobileUser();//MobileUser is abstract; cannot be instantiated
        MobileUser ms;//ms is reference variable
        ms = new Rahim();
        ms.sendMessage();
        
        ms = new Karim();
        ms.sendMessage();
        
        //non abstract method
        ms.call();
        
        
    }
  
}
