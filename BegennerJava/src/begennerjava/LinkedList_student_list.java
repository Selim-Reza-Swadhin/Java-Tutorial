package begennerjava;

import java.util.LinkedList;

public class LinkedList_student_list {
 String name,className;
 int id;

    LinkedList_student_list(int id, String name, String className) {//constructor
        this.name = name;
        this.className = className;
        this.id = id;
    }
    
    
    
    public static void main(String[] args) {
        //custom datatype LinkedList_student_list
        LinkedList<LinkedList_student_list> list = new LinkedList<LinkedList_student_list>();
        
        //student create
        LinkedList_student_list s1 = new LinkedList_student_list(101, "Karim", "eleven");
        LinkedList_student_list s2 = new LinkedList_student_list(102, "Rahim", "seven");
        LinkedList_student_list s3 = new LinkedList_student_list(103, "Selim", "eleven");
        LinkedList_student_list s4 = new LinkedList_student_list(104, "Salam", "eleven");
        LinkedList_student_list s5 = new LinkedList_student_list(105, "Reza", "6");
        
        //adding student
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        
        for(LinkedList_student_list s : list){            
        System.out.println(s.id+" "+s.name+" "+s.className);
        }
    }
 
}
