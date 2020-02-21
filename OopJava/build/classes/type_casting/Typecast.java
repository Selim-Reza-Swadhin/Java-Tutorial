package type_casting;

public class Typecast {

    public static void main(String[] args) {
        //super_class <--- sub_class
        Person p = new Teacher();//upcasting
        p.display();
        
        //sub_class <--- super_class
        Teacher t = (Teacher)new Person();//down casting (not work)
        t.display();
    }
}
