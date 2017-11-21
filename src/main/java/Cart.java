import Game.ComputerGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cart {
    private List<ComputerGame> games;
    private List<ComputerGame> toShip;
    private boolean shipped = false;
    private int totalPrice = 0;
    private Random rnd = new Random();

    public Cart(){
        this.games = games;
    }

    public boolean ship(){
        shipped = true;
        return shipped;
    }

    public PaymentStrategy getPaymentType(){
        return generatePaymentMethod();
    }

    public DeliveryStrategy getDeviveryType(){
        return generateDeliveryMethod();
    }

    public boolean addToCart(ComputerGame game){
        games.add(game);
        totalPrice += game.getParams().getPrice();
        return true;
    }

    public double computeTotal(){
        return totalPrice;
    }

    public PaymentStrategy generatePaymentMethod(){
        ArrayList<PaymentStrategy> paymentMethods= new ArrayList<>();
        Privat24Payment privat24 = new Privat24Payment();
        CashPayment cash = new CashPayment();
        paymentMethods.add(privat24);
        paymentMethods.add(cash);
        return paymentMethods.get(rnd.nextInt(paymentMethods.size()));
    }

    public DeliveryStrategy generateDeliveryMethod(){
        ArrayList<DeliveryStrategy> deliveryMethods = new ArrayList<>();
        DeliveryNHL nhl = new DeliveryNHL();
        DeliveryNovaPoshta novaPoshta = new DeliveryNovaPoshta();
        deliveryMethods.add(nhl);
        deliveryMethods.add(novaPoshta);
        return deliveryMethods.get(rnd.nextInt(deliveryMethods.size()));
    }


}
