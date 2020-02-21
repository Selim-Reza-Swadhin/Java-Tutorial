package inheritance;

public class InheriTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Selim";
        p.age = 30;
        p.displayInformation1();
        
        Teacher t = new Teacher();
        t.name = "Selim Reza Swadhin";
        t.age = 32;
        t.qualification = "Bsc";
        t.displayInformation2();
    }
  
}
