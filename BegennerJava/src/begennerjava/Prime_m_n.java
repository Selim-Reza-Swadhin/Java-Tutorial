package begennerjava;

import java.util.Scanner;

public class Prime_m_n {

    public static void main(String[] args) {

        int m, n, count = 0, totalPrime = 0;
        Scanner iput = new Scanner(System.in);

        System.out.print("Enter Start Prime number : ");
        m = iput.nextInt();

        System.out.print("Enter End Prime number : ");
        n = iput.nextInt();

        for (int i = m; i <= n; i++) {
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }

            /*//nor working and not use {}
            if (count==0) {
                System.out.println(i);
                count=0;
            }*/
//==============================================
//            if (count==0){
//                System.out.println(i);
//                count=0;
//======================== or ======================
            if (count == 0) {
                System.out.println(i);
                totalPrime++;
            }
            count = 0;
        }
        
        System.out.println("Total Prime number = "+totalPrime);
    }

}
