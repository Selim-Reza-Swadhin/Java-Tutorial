package begennerjava;

public class String_4 {

    public static void main(String[] args) {
        //String s1 = "This is my country";
        //String s1 = "This_is_my_country";
        String s1 = "01724-063642";
        String s2 = s1.replace('i', 'j');

        System.out.println(s2);
        
        //String[] sp = s1.split(" ");
        //String[] sp = s1.split("_");
        String[] sp = s1.split("-");
        for (String s:sp) {
            System.out.println(s);
        }
        
    }

}
