package static_var;

public class Student {

    String name;
    int id;
//static who daid static or class or common variable. static is relation class name not obj.
    static String universityName = "LU";

    //constructor
    Student(String n, int i) {
        name = n;
        id = i;
    }

    void displayInformation() {
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
        System.out.println("University Name : " + universityName);
        System.out.println("\n");
    }

//    public static void main(String[] args) {
//        Student s1 = new Student("Selim", 111);
//        Student s2 = new Student("Reza", 112);
//        s1.displayInformation();
//        s2.displayInformation();
//    }
}
