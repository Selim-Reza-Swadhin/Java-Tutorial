package encapsulation;

public class Person {

//    String name;
//    int age;
//    void display() {
//        System.out.println("Name : "+name);
//        System.out.println("Age : "+age);
//    }
    //Setter and Getter
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    //this keyword use
//    public void setAge(int age) {
//        this.age = age;
//    }
    //this keyword not use
    public void setAge(int a) {
        //this.age = a;
        age = a;
    }

}
