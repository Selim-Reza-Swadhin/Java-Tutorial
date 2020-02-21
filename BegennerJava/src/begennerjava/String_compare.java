package begennerjava;

public class String_compare {
    public static void main(String[] args) {
        //String password1 = "anis123";
        String password1 = "Anis123";
        String password2 = "anis123";
        String password3 = new String("anis123");
        String password4 = new String("anis123");
        
        //Compares the orginal content of the string
        System.out.println(password1.equals(password2));
        System.out.println(password1.equals(password3));
        System.out.println(password3.equals(password4));
        
        //Compares the references of the objects not the value
        System.out.println("\n");
        System.out.println(password1 == password2);
        System.out.println(password1 == password3);
        System.out.println(password3 == password4);
        
        System.out.println("\n");
        System.out.println(password1.equalsIgnoreCase(password2));
        System.out.println(password1.equalsIgnoreCase(password3));
        System.out.println(password3.equalsIgnoreCase(password4));
        
    }
  
}
