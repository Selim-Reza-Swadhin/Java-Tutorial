package oopjava;

public class Test1 {

    public static void main(String[] args) {
        Teacher1 teacher1 = new Teacher1();
        teacher1.name = "Selim";
        teacher1.gender = "male";
        teacher1.phone = 01724063642;

        System.out.println(" " + teacher1.name);
        System.out.println(" " + teacher1.gender);
        System.out.println(" " + teacher1.phone);
        
        //--------------------------------------------
        Teacher1 teacher2 = new Teacher1();
        teacher2.name = "Reza";
        teacher2.gender = "female";
        teacher2.phone = 01726634554;

        System.out.println("Name " + teacher2.name);
        System.out.println("Gender " + teacher2.gender);
        System.out.println("Phone " + teacher2.phone);
    }

}
