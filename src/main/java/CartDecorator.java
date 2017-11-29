
public class CartDecorator extends Cart {
    protected Cart cart;

    public CartDecorator(Cart cart){
        this.cart = cart;
    }

    @Override
    public boolean ship(){
        return super.ship();
    }

    @Override
    public double computeTotal(){
        return super.computeTotal();
    }
}
