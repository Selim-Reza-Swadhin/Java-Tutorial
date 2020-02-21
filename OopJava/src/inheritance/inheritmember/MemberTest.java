package inheritance.inheritmember;

public class MemberTest {

    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("Hamid");
        t.setAge(33);
        t.setQualification("M.sc");

//        System.out.println(t.getName());
//        System.out.println(t.getAge());
//        System.out.println(t.getQualification());

        t.display();
    }

}
