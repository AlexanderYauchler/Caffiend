import java.util.ArrayList;

public class Order {
    ArrayList<Product> cart;
    ArrayList<Integer> quantities;
    ShippingAddress shipTo;

    int orderID;

    static int idNum = 0;

    Order(
        ArrayList<Product> cart,
        ArrayList<Integer> quantities,
        ShippingAddress shipTo
    ) {
        this.cart = cart;
        this.quantities = quantities;
        this.shipTo = shipTo;
        this.orderID = idNum;

        idNum++;
    }

    public boolean viewOrder() {
        if (cart.size() != quantities.size() || cart.isEmpty()) return false;

        System.out.println("Order Num " + orderID);

        for (int i = 0; i < cart.size(); i++) {
            System.out.println(cart.get(i) + " | Quantity: " + quantities.get(i));
        }

        return true;
    }
}
