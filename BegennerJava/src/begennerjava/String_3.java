package begennerjava;

public class String_3 {

    public static void main(String[] args) {
        String country = "Bangladesh is my country";
        System.out.println(country);
        
        String s3 = country.trim();
        System.out.println(s3);

        char ch = country.charAt(0);//0 is index number
        System.out.println("ch " + ch);

        //int value = country.codePointAt(0);//as key value
        int value = country.codePointAt(1);//as key value
        //int value = country.codePointCount(3, 6);
        System.out.println("value " + value);

        int pos = country.indexOf("y");
        System.out.println("pos " + pos);

        pos = country.lastIndexOf("y");
        System.out.println("pos " + pos);
    }

}
