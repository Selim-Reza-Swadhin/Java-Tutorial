package begennerjava;

import java.util.LinkedList;

public class LinkedList_1 {

    public static void main(String[] args) {
        //ArrayList<Integer> number = new ArrayList<Integer>(array size);//Right
        LinkedList<String> countryNames = new LinkedList<String>();//()no size
        countryNames.add("Afghanistan");
        countryNames.add("Bangladesh");
        countryNames.add("India");
        countryNames.add("Pakistan");
        countryNames.add("Nepal");
        
        countryNames.add(5,"Brazil");//add(Integer i, String e)means i->index, e->elements
        countryNames.addFirst("Australia");
        countryNames.addLast("Japan");
        //countryNames.remove("Japan");
        //countryNames.remove(7);
        //countryNames.removeFirst();
        //countryNames.removeLast();
        System.out.println("First elements : "+countryNames.get(5));
        System.out.println("First elements : "+countryNames.getFirst());
        System.out.println("First elements : "+countryNames.peek());
        countryNames.clone();
        countryNames.clear();
        
        
        
        //System.out.println(countryNames);
        
        for(String country : countryNames){
            System.out.println(country);
        }
        
        System.out.println("Size of the Linkedlist : "+countryNames.size());
    }
}
