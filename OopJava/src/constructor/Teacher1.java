package constructor;

public class Teacher1 {

    String name, gender;
    int phone;

    //contructor name and class name same
    Teacher1() {
        System.out.println("No value");
    }
    
    Teacher1(String n, String m, int ph) {
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
}

