
public class DiscountDecorator extends CartDecorator {
    public DiscountDecorator(Cart cart) {
        super(cart);
    }

    @Override
    public double computeTotal(){
        return super.computeTotal() * 0.8;
    }

}
