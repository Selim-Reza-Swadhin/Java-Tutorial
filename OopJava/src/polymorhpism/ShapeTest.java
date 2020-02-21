package polymorhpism;

public class ShapeTest {

    public static void main(String[] args) {
        Shape shape = new Shape();
        Rectangle rectangle = new Rectangle(10, 20);//constructor hole para dea jay
        Triangle triangle = new Triangle(10, 20);

        System.out.println(shape.area());
        System.out.println(rectangle.area());
        System.out.println(triangle.area());

        Shape s1 = new Shape();
        Shape s2 = new Rectangle(10, 20);//constructor hole para dea jay
        Shape s3 = new Triangle(10, 20);

        System.out.println(s1.area());
        System.out.println(s2.area());
        System.out.println(s3.area());
        
        Shape[] s = new Shape[3];
        s[0] = new Shape();
        s[1] = new Rectangle(10, 20);//constructor hole para dea jay
        s[2] = new Triangle(10, 30);
        
        System.out.println(s[0].area());
        System.out.println(s[1].area());
        System.out.println(s[2].area());
        
        for (int i = 0; i < 3; i++) {
           System.out.println(s[i].area()); 
        }
    }

}
