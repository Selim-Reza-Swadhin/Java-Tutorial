package oopjava;

public class CallByReference {

    String name;

    //Start CallByReference
    void change(CallByReference r2) {
        r2.name = "Rubel Ahmed";
    }
}
