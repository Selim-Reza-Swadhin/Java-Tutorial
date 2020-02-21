package begennerjava;

public class For_each_vs_array {
    public static void main(String[] args) {
        //String[] names = new String[4];
        //names[0] = "Anis";
        //names[1] = "Islam";
        //names[2] = "Selim";
        //names[3] = "Reza";
        
        //String[] names = ["Anis","Islam","Reza","selim"];//wrong array
        String[] names = {"Anis","Islam","Reza","selim"};//Right array
        
        for (int i = 0; i < 4; i++) {
            System.out.println(names[i]);
        }
        
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        
        for (String s : names) {//enhance loop
            System.out.println("Enhance loop "+s);
        }
        
        int[] num = {10, 20, 30, 40};
        int sum = 0;
        for (int i : num) {//enhance loop
            sum = sum + i;
            //System.out.println("Total "+sum);
        }
            System.out.println("Total "+sum);
    }
 
}
