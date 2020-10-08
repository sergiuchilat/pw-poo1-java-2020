public class Scholar extends Person{

    Scholar(String name){
        System.out.println("Scholar Constructor run");
        this.name = name;
        this.age = 6;
    }

    Scholar(String name, Integer age) {
        System.out.println("Scholar Constructor run");
        this.name = name;
        if (this.checkMinimumAge(age)) {
            this.age = age;
        }
    }

    public void listen(){
        System.out.println("Scholar listen " + this.name);
    }

    public boolean checkMinimumAge(Integer age){
        return age >= 6;
    }
}
