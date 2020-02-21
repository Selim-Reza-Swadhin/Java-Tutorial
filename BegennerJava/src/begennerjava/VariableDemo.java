package begennerjava;

public class VariableDemo {

    public static void main(String[] args) {
        
      boolean b;
      char c;
      short s;
      int i;
      float f;
      double d;
      
      b = true;
        
        System.out.println(b);
        System.out.println(" boolean = "+b);//variable value before + simble use
        
        c = 'a';
        System.out.println(" char = "+c);
        
        s = 12677;
        System.out.println(" short = "+s);
        
        i = 15467;
        System.out.println(" int = "+i);
        
        //f = 15.5;//wrong
        f = 15.5f;//right
        System.out.println(" float = "+f);
        
          d = 12.55;//defualt
        System.out.println(" double = "+d);
    }
}
