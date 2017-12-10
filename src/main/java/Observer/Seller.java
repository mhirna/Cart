package Observer;

public class Seller extends User {
    public Seller(int age, String name) {
        super(age, name);
    }

    @Override
    public void update(){
        System.out.println("Seller is updated!");
    }
}
