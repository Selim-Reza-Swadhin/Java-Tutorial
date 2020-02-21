package static_var;

public class Static_block {

    static int id;
    static String name;

    static {
        id = 101;
        name = "Selim";
    }

//  void display(){// please static keyword declare
//       System.out.println("I from display id : "+id);
//       System.out.println("I from display Name : "+name);
//   }
    static void display() {
        System.out.println("I from display id : " + id);
        System.out.println("I from display Name : " + name);
    }

    public static void main(String[] args) {

        Static_block.display();

        System.out.println("I from main id : " + Static_block.id);
        System.out.println("I from main Name : " + Static_block.name);
    }

    static {
        //System.out.println("Static block er priority sobche beshi");
    }
}
