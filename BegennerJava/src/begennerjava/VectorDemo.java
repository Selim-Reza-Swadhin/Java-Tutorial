package begennerjava;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {
        // capacity and initial size is 3, increment is 2
        Vector v = new Vector(3, 2);
        System.out.println("Initial size: " + v.size());
        System.out.println("Initial capacity: " + v.capacity());
        v.addElement(new Integer(1));
        v.addElement(new Integer(2));
        v.addElement(new Integer(3));
        System.out.println("Capacity after 3 additions: " + v.capacity());
        v.addElement(new Double(5.45));
        v.addElement(new Integer(5));
        System.out.println("Current Capacity: " + v.capacity());
        System.out.println("First Element: " + (Integer) v.firstElement());
        System.out.println("Last Element: " + (Integer) v.lastElement());

        if (v.contains(new Integer(3))) {
            System.out.println("Vector contains 3.");
        }

        // enumerate the elements in the vector
        Enumeration vEnum = v.elements();
        System.out.println("\nElements in vector");
        while (vEnum.hasMoreElements()) {
            System.out.println(vEnum.nextElement() + "");
        }
        System.out.println();
    }
}
