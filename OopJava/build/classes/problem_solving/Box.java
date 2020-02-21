package problem_solving;

public class Box {

    double height, width, depth;

    //constructor
    Box(double h, double w, double d) {
        height = h;
        width = w;
        depth = d;
    }
    
    void displayVol(){
        double  vol = height * width * depth;
        System.out.println("Volume is : "+vol);
    }
}
