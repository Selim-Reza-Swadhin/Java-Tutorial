package begennerjava;

public class Array_1 {
    public static void main(String[] args) {
        int[] number = new int[5];
        number[0] = 10;
        number[1] = 20;
        number[2] = 30;
        number[3] = 40;
        number[4] = 50;
        
        System.out.println(number[0]);
        System.out.println(number.length);
        System.out.println(number[0]+number[1]+number[2]+number[3]+number[4]);
    }
}
