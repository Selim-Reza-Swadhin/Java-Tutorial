package begennerjava;

public class String_Builder {
    public static void main(String[] args) {
        //StringBuffer str = new StringBuffer("Selim");
        
        StringBuilder str = new StringBuilder("Selim");//StringBuffer and StringBuilder same
        System.out.println("str : "+str);
        
        str.append(" Reza");
        str.append(" Swadhin ");
        str.append("30 ");
        str.append(30.5);
        System.out.println("str : "+str);
        
        str.reverse();
        System.out.println("str : "+str);
        
        str.delete(0, 5);
        System.out.println("str : "+str);
    }
 
}
