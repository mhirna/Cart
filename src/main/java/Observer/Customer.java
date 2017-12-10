
package Observer;

public class Customer extends User{
    public Customer(int age, String name) {
        super(age, name);
    }

    @Override
    public void update(){
        System.out.println("Customer is updated!");
    }
}
