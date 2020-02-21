package encapsulation;

public class EncapTest {
//      public static void main(String[] args) {
//        Person p = new Person();
//        p.name ="Selim";
//        p.age=23;
//        p.display();
//    } 

    //Setter and Getter
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Selim");
        p.setAge(23);
        System.out.println("" + p.getName());
        System.out.println("" + p.getAge());
    }
}
