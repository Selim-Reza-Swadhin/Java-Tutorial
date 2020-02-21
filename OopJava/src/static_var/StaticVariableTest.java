package static_var;

public class StaticVariableTest {
    public static void main(String[] args) {
        Static_variable obj = new Static_variable();
        System.out.println(" "+obj.universityName);//obl name use
        
        //static who daid static or class or common variable. static is relation class name not obj.
        System.out.println(" "+Static_variable.versityName);//Static_variable class name use
    }
 
}
