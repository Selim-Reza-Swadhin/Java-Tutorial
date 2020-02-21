package problem_solving;

public class Circle extends Shape {
    double r;

//    public Circle(double r, double dim1, double dim2) {
//        super(dim1, dim2);
//        this.r = r;
//    }
    
    public Circle(double r) {
        super(r,r);
        this.r = r;
    }
    
    void area() {
        //double result = 3.1416 * dim1 * dim2;
        double result = Math.PI * dim1 * dim2;
        System.out.println("Circle area = " + result);
    }
}
