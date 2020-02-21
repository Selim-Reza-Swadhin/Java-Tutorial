package filejava;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class File_write {

    public static void main(String[] args) {
        String id,name;
        try {
            Formatter formatter = new Formatter("E:/AnisulJava/FileJava/selimfolder/selim.txt");

//            formatter.format("%d %s\r\n",101,"Anisul");
//            formatter.format("%d %s\r\n",102,"Islam");
//            formatter.format("%d %s\r\n",103,"Rubel");


            Scanner scanner = new Scanner(System.in);
            System.out.print("How many students : ");
            int num = scanner.nextInt();

            for (int i = 1; i <= num; i++) {
                System.out.print("Enter student id and name : ");
                id = scanner.next();
                name = scanner.next();
                formatter.format("%s %s\r\n", id,name);
            }

            formatter.close();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

}
