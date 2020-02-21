package overloading_constructor;

public class OverloadingConstructorTest {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        
        
        Teacher teacher2 = new Teacher("Anis", "male");
        teacher2.displayInformation();
        
        
        Teacher teacher3 = new Teacher("Selim", "female", 1724063642);
        teacher3.displayInformation();
        
    }
 
}
