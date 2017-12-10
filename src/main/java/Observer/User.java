package Observer;

public class User implements Observer {
    private int age;
    private String name;

    public User(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public void update() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
