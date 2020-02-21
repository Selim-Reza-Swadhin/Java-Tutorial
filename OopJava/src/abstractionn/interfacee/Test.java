package abstractionn.interfacee;

public class Test {
    public static void main(String[] args) {
        //Animal animal = new Animal();//Animal is abstract; cannot be instantiated
        
        Dog dog = new Dog();
        dog.eat();
        
        Cats cats = new Cats();
        cats.eat();
    }
  
}
