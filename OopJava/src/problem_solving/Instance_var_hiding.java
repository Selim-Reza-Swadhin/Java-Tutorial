package problem_solving;

public class Instance_var_hiding {

    double height, width, depth;

    //constructor
    Instance_var_hiding(double h, double w, double d) {
        height = h;
        width = w;
        depth = d;
    }

    //Instance variable hiding
    Instance_var_hiding(int height, double width, double depth) {
        //no use
//        height = height;
//        width = width;
//        depth = depth;

        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    void displayVol() {
        double vol = height * width * depth;
        System.out.println("Volume is : " + vol);
    }

    public static void main(String[] args) {
        Instance_var_hiding box1 = new Instance_var_hiding(10, 10, 10);
        box1.displayVol();

        Instance_var_hiding box2 = new Instance_var_hiding(20, 30, 10);
        box2.displayVol();
    }

}
