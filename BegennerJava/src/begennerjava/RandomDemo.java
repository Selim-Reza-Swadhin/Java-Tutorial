package begennerjava;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println(rand);
        
        //int randomNumber = rand.nextInt(10);//0 to 9
        //int randomNumber = rand.nextInt(10) + 1;//1 to 9
        //int randomNumber = (int)(Math.random() * 10);//0 to 9
        int randomNumber = (int)(Math.random() * 10) + 1;//1 to 9
        System.out.println("Random number : "+randomNumber);
    }
 
}
