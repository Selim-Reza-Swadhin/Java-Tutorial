package filejava;

import java.io.File;

public class Create_folder {
    public static void main(String[] args) {
        
        //File dir = new File("personfolder");//create folder name current directory  
        //dir.mkdir();//create folder
        
        File dir = new File("C:/Users/SELIMREZA/Desktop/personfolder");//create folder name  
        dir.mkdir();//create folder
        
        String dirlocation = dir.getAbsolutePath();//show path
        System.out.println(dirlocation);
        System.out.println(dir.getName());//directory name
        
        //dir.delete();//dir delete
        if(dir.delete()){
            System.out.println(dir.getName()+" Folder has been deleted");
        }
        
    }
  
}
