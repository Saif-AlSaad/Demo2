
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Student s1 = new Student("Saif", 1367, 3.89);
        Student s2 = new Student("Arafat", 1000, 3.67);

        s1.setName("Rizvi");

        System.out.println(s1.getName());
        System.out.println(s1.getID());
        System.out.println(s1.getCG());

        System.out.println();
//        System.out.println(s2.getName());
//        System.out.println(s2.getID());
//        System.out.println(s2.getCG());
//        System.out.println();

        Human human = new Human();
        human.setName("ARA");
        System.out.println(human.getName());
        System.out.println(human.getAge());
        human.anime();

    }
}

