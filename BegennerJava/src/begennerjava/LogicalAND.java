package begennerjava;

import java.util.Scanner;

public class LogicalAND {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Enter any letter : ");
        ch = input.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Enter letter " + ch+" is Small");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Enter letter "+ ch+" is Capital");
        } else {
            System.out.println("Enter "+ ch+" is Not a letter");
        }
    }
}
