package filejava;

import java.io.File;
import java.util.Scanner;

public class File_read {

    public static void main(String[] args) {
        try {
            File file = new File("E:/AnisulJava/FileJava/selimfolder/selim.txt");
            Scanner scanner = new Scanner(file);//file read
            while (scanner.hasNext()) {//all file read
                String id = scanner.next();
                String name = scanner.next();
                System.out.println("Id : "+id+" Name: "+name);
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
