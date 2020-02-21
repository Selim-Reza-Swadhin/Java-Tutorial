package begennerjava;

import java.util.Scanner;

public class TemperatureDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cels, fahrenheit;
        System.out.print("Celcius : ");
        cels = input.nextDouble();
        
        fahrenheit =1.8 * cels + 32;
        System.out.println("Fahrenheit = "+fahrenheit);

//Celcius
 double fahrenheitt, celsc;
        System.out.print("Fahrenheit : ");
        fahrenheitt = input.nextDouble();
        
        celsc = 0.55 * (fahrenheitt - 32);
        System.out.println("Celcius = "+celsc);
    }
 
}
