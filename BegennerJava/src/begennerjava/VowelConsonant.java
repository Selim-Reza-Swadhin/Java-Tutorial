package begennerjava;

import java.util.Scanner;

public class VowelConsonant {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Enter any letter : ");

        ch = input.next().charAt(0);//first charecters

        if (ch == 'a' || ch == 'A') {
            System.out.println("Your enter letter " + ch + " is vowel ");
        } else if (ch == 'e' || ch == 'E') {
            System.out.println("Your enter letter " + ch + " is vowel ");

        } else if (ch == 'i' || ch == 'I') {
            System.out.println("Your enter letter " + ch + " is vowel ");
        } else if (ch == 'o' || ch == 'O') {
            System.out.println("Your enter letter " + ch + " is vowel ");

        } else if (ch == 'u' || ch == 'U') {
            System.out.println("Your enter letter " + ch + " is vowel ");
        } else {
            System.out.println("Your enter letter " + ch + " is consonant ");
        }

    }
}
