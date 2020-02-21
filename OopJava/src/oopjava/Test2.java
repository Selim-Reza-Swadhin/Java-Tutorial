package oopjava;

public class Test2 {

    public static void main(String[] args) {
        Teacher2 teacher1 = new Teacher2();
        teacher1.name = "Selim";
        teacher1.gender = "male";
        teacher1.phone = 01724063642;
        teacher1.displayInformation();
        
        //--------------------------------------------
        Teacher2 teacher2 = new Teacher2();
        teacher2.name = "Reza";
        teacher2.gender = "female";
        teacher2.phone = 01726634554;
        teacher2.displayInformation();
    }

}
