package begennerjava;

public class String_Buffer {

    public static void main(String[] args) {
        //String s1 = "Selim";
        //StringBuffer sb = new StringBuffer(s1);
        
        StringBuffer sb = new StringBuffer("Selim");
        System.out.println(sb);
        
        //String sb1 = sb.append(" rezas");// difference String vs StringBuffer
        //System.out.println(sb1);
        
        
        //StringBuffer sb = sb.append(" rezas");
        sb.append(" Reza");
        sb.append(" Swadhin ");
        sb.append(30);
        System.out.println(sb);
        
        
        //sb.reverse();
        //System.out.println(sb);
        
        //sb.delete(0, 5);
        //System.out.println(sb);
        
        //sb.setLength(5);
        sb.setLength(10);
        System.out.println(sb);
        
        
    }

}
