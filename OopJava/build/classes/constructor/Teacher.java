package constructor;

public class Teacher {

    String name, gender;
    int phone;

    //contructor name and class name same
    Teacher(String n, String m, int ph) {
        name = n;
        gender = m;
        phone = ph;
    }

    void displayInformation() {
        System.out.println("Name " + name);
        System.out.println("Gender " + gender);
        System.out.println("Phone " + phone);
        System.out.println("\n\n");
    }

    //contructor name and class name same
//    Teacher(String n, String m, int ph) {
//        name = n;
//        gender = m;
//        phone = ph;
//
//        System.out.println("Name " + name);
//        System.out.println("Gender " + gender);
//        System.out.println("Phone " + phone);
//    }
}
