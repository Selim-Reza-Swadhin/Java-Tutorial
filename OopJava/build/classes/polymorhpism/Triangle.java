package polymorhpism;

public class Triangle extends Shape {
    double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    @Override
     double  area(){
         System.out.print("I am Triangle : ");
      return 0.5*base*height;
  }
}
