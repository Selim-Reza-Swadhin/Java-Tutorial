package constructor;

public class Test1 {

    public static void main(String[] args) {
        Teacher1 teacher1 = new Teacher1("swadhinn", "male", 1724362514);
        teacher1.displayInformation();
        
        //--------------------------------------------
        Teacher1 teacher2 = new Teacher1("zannat", "female", 1717018146);
        teacher2.displayInformation();
        
        //--------------------------------------------
        Teacher1 teacher3 = new Teacher1();
        teacher3.displayInformation();
    }

}

