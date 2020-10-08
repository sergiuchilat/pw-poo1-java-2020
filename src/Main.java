public class Main {
    public static void main(String[] args) {
//        Student student1 = new Student("Ion Creanga");
//        student1.listen();
//
//        Student student2 = new Student("Mihai Eminescu");
//        student2.listen();
//
//        System.out.println(student1);
//        System.out.println(student2);
//
//        System.out.println(student1.getName());
//        System.out.println(student2.getName());
//
//        student1.setName("Ion Eminescu");
//
//        System.out.println(student1.getName());
//        student1.setAge(23);
//        System.out.println(student1.getAge());

        Scholar scholar = new Scholar("Andrei Ciobanu", 4);
        Student student = new Student("Mihai Eminescu", 25);

        System.out.println(scholar.getName() + " = " + scholar.getAge());
        System.out.println(student.getName() + " = " + student.getAge());

    }
}
