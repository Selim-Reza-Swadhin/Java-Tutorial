package begennerjava;

public class String_palindrome {
    public static void main(String[] args) {
        String s1 = "madam";
        StringBuffer sb = new StringBuffer(s1);
        
        //sb.reverse();
        //System.out.println(sb);
        
        String s2 = sb.reverse().toString();
        System.out.println(s2);
        
        if (s1.equals(s2)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not Palindrome");
        }
    }
  
}
