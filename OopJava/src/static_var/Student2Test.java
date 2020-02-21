package static_var;

public class Student2Test {

    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.totalStudent();

        Student2 s2 = new Student2();
        s2.totalStudent();

        Student2 s3 = new Student2();
        //s3.totalStudent();
        Student2.totalStudent();//static void

    }
}
