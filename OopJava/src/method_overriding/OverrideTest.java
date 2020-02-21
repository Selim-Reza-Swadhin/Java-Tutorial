package method_overriding;

public class OverrideTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name="Selim";
        teacher.age=33;
        teacher.qualification="M.sc";
        teacher.displayInformation();
        
        Person person = new Person();
        person.name= "Selim Reza";
        person.age= 23;
        person.displayInformation();
    }
  
}
