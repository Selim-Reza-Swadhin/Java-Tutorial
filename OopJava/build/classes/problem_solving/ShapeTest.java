package problem_solving;

public class ShapeTest {
    public static void main(String[] args) {
        //Shape shape = new Shape();//Shape is abstract; cannot be instantiated
        Shape shape;//reference variable
        shape = new Rectangle(10, 20);
        shape.area();
        
        shape = new Triangle(10, 20);
        shape.area();
        
        shape = new Circle(10);
        shape.area();
        
    }
  
}
