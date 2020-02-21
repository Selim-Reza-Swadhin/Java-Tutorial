package begennerjava;

public class This {
    
    String name;
    int age;
    String haircolor;
    
//    This(String n, int x){//constructor
//       name = n;
//       age = x;
//    }
    
    This(String name, int age){
       this.name = name;
       this.age = age;
    }
    
    
    This(String name, int age, String haircolor){
       //this.name = name;
       //this.age = age;
       
       this(name, age);//constructor
       this.haircolor = haircolor;
    }
    
    void display(){
        System.out.println("\n");
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
    
    void display2(){
        //this.display();//this keyword here default
        display();
        System.out.println("Haircolor : "+haircolor);
    }
    
    
    
    
    public static void main(String[] args) {
        This a = new This("Anisul", 27);//constructor
        a.display();
        
        This b = new This("Hasib", 17, "black");
        b.display2();
    }
   
}
