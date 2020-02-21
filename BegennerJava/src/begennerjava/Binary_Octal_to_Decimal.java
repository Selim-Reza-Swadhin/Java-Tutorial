package begennerjava;

public class Binary_Octal_to_Decimal {

    public static void main(String[] args) {
        String binary = "1010";
        Integer decimal = Integer.parseInt(binary, 2);
        System.out.println("Binary to decimal " + decimal);
        
        String octal = "675";
        Integer deci = Integer.parseInt(octal, 8);
        System.out.println("Octal to decimal " + deci);
        
        //String hexa = "675";
        //String hexa = "F";
        String hexa = "A";
        Integer decim = Integer.parseInt(hexa, 16);
        System.out.println("Hexadecimal to decimal " + decim);
    }

}
