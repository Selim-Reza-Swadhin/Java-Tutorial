package begennerjava;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        //int number = 120;
        //System.out.println(number);
        
        //User input
        //Scanner input = new Scanner(System.in);
        //int number;
        //System.out.print("Enter your any number : ");//Single line statement
        //System.out.println("Enter your any number : ");//new line statement
        //number = input.nextInt();
        //System.out.println("Number = "+number);
        
        
        //User double input
        Scanner input = new Scanner(System.in);
        double number;
        System.out.println("Enter your any number : ");//new line statement
        number = input.nextDouble();
        System.out.println("Double Number = "+number);
       
        
        
        //String
        //String name = "Selim Reza Swadhin";
        //System.out.println("Name is : "+name);
        
        //User input
        //Scanner inputUser = new Scanner(System.in);
        //String name;
        // System.out.println("Enter your name : ");
        //name = inputUser.next();
        //name = inputUser.nextLine();
        //System.out.println("Welcome  "+name);
    }
}
