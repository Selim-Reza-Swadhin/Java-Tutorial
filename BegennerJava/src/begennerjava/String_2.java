package begennerjava;

public class String_2 {
    public static void main(String[] args) {
        String fname = "Selim";
        String lname = " Reza";
        String fulname = fname+lname;
        //System.out.println(fulname);
        
        //System.out.println(fname.concat(lname));
        //System.out.println(fulname.toUpperCase());
        
        //boolean b = fname.startsWith("S");
        boolean b = lname.endsWith("za");
        System.out.println(b);
    }
 
}
