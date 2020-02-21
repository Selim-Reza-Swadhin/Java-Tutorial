package oopjava;

public class Teacher3 {

    String name, gender;
    int phone;

    //return_type method_name(){}
    void setInformation(String n, String m, int ph) {
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

//    void setInformation(String n, String m, int ph) {
//        name = n;
//        gender = m;
//        phone = ph;
//        System.out.println("Name " + name);
//        System.out.println("Gender " + gender);
//        System.out.println("Phone " + phone);
//    }
    
}
