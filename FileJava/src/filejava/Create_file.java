package filejava;

import java.io.File;

public class Create_file {

    public static void main(String[] args) {

        File dir = new File("selimfolder");
        dir.mkdir();

        File file1 = new File("E:/AnisulJava/FileJava/selimfolder/selim.txt");
        //File file2 = new File("E:/AnisulJava/FileJava/selimfolder/zannat.txt");

        String path = dir.getAbsolutePath();//show path
        File file2 = new File(path + "/hamid.txt");

        try {
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("Files are created.");
        } catch (Exception e) {
            System.out.println(e);
        }

        //file1.delete();
        if (file1.exists()) {
            System.out.println("Files Exixts");
        }

//        if (file1.delete()) {
//            System.out.println(file1.getName() + " File has been deleted");
//        }

    }

}
