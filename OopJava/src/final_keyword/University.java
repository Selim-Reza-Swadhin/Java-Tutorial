package final_keyword;

public class University {

    //String name="LU";
    //int fee=37000;
    
    //final and const same keyword. no change or modify value
    //final String name="LU";//final variable
    final String NAME = "LU";//better
    //final int fee= 3700;
    
//    final int fee;//blank final variable
//    University(){//constructor
//        fee = 3700;
//    }
    
    static final int fee;//static blank final variable
    static{//static block
      fee = 3700;  
    }
    

    void display() {
        //System.out.println(name); 
        System.out.println(NAME);//better 
        System.out.println(fee);
    }
}

