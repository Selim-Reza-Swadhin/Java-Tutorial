package begennerjava;

public class String_1 {

    public static void main(String[] args) {
        String s1 = "Anisul Islam";
        String s2 = new String("Anisul Islam");

        //char[] s3 = {'a', 's', 'e', 'g'};
        //System.out.println(s3);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        //int len = s1.length();
        //System.out.println("Length of at "+len);
//        if (s1 == s2) {//not working. it is not value but obj
//            System.out.println("Equals");
//        } else {
//            System.out.println("not Equals");
//        }
//        if (s1.contains(s2)) {//it is object
//            System.out.println("Equals");
//        } else {
//            System.out.println("not Equals");
//        }
        if (s1.equals(s2)) {
            System.out.println("Equals");
        } else {
            System.out.println("not Equals");
        }

        String s3 = "anisul Islam";
        String s4 = new String("Anisul islam");
        
        if (s3.equalsIgnoreCase(s4)) {
            System.out.println("Equals");
        } else {
            System.out.println("not Equals");
        }
        
        boolean con = s3.contains("Islam");
        //boolean con = s3.contains("Islal");
        System.out.println(con);
        
        boolean b = s3.isEmpty();
        System.out.println(b);

    }

}
