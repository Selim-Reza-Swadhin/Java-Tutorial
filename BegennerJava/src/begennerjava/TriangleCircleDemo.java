package begennerjava;

import java.util.Scanner;

public class TriangleCircleDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       double base, height, area;
       
        System.out.print("Enter base : ");
        base = input.nextDouble();
        
        System.out.print("Enter height : ");
        height = input.nextDouble();
        
        area = 0.5 * base * height;
        System.out.println("Area of Tringle = "+area);
    }
}
