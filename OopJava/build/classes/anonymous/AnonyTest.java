package anonymous;

public class AnonyTest {

    public static void main(String[] args) {
        Person person = new Person() {
            @Override
            void display() {
                System.out.println("AnonyTest class");
            }
        };
        
        person.display();
        
    }

}
