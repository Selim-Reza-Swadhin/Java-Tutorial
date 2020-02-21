package polymorhpism;

public class PolyTest {

    public static void main(String[] args) {
        Person person = new Person();
        person.displayInformation();

        //Person teacher = new Teacher();//refarence
        person = new Teacher();
        person.displayInformation();
        
        person = new Student();
        person.displayInformation();
    }
}
