package oopjava;

public class CallByReferenceTest {

    public static void main(String[] args) {
        CallByReference obj = new CallByReference();
        obj.name = "Anisul Islam";
        System.out.println("before calling : " + obj.name);

        //Call CallByReference
        obj.change(obj);
        System.out.println("after calling : " + obj.name);
    }

}
