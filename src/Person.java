abstract public class Person {
    protected Integer id;
    protected String name;
    protected Integer age = null;

    public void setAge(Integer age) {
        if (this.checkMinimumAge(age)) {
            this.age = age;
        }
    }

    public Integer getAge() {
        return age;
    }


    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public abstract boolean checkMinimumAge(Integer age);
}
