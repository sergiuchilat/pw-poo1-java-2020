public class Student extends Person{

    Student(String name){
        System.out.println("Student Constructor run");
        this.name = name;
        this.age = 18;
    }

    Student(String name, Integer age){
        System.out.println("Student Constructor run");
        this.name = name;
        if (this.checkMinimumAge(age)) {
            this.age = age;
        }
    }

    public void listen(){
        System.out.println("Student listen " + this.name);
    }

    public boolean checkMinimumAge(Integer age){
        return age >= 18;
    }
}
