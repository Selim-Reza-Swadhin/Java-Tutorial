package inheritancejava;

public class Son extends Father {

//    String name = "Digital Bangladesh Son";
//    public void mydata(){
//        System.out.println(name);
//        System.out.println(super.name);
//    }
    
//    @Override
//    public void cal() {
//        int a = 10;
//        int b = 20;
//        System.out.println(a - b);
//    }
    
    @Override
    public void cal() {
        double  a = 10.00;
        double  b = 20.00;
        System.out.println(a/b);
    }
    
    public void mydata() {
        super.cal();
    }
    
    

}
