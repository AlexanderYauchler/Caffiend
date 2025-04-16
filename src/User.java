import java.util.ArrayList;
import java.util.UUID;

public class User {
    String name;
    String email;
    String username;
    String password;
    ShippingAddress shippingAddress;
    PaymentInfo paymentInformation;
    ArrayList<Order> orderHistory;
    ArrayList<Product> cart;
    ArrayList<Integer> quantities;

    private UUID uUUID;

    User(
        String name,
        String email,
        String username,
        String password,
        ShippingAddress shippingAddress,
        PaymentInfo paymentInformation,
        ArrayList<Order> orderHistory,
        ArrayList<Product> cart,
        ArrayList<Integer> quantities
    ) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.uUUID = UUID.randomUUID();
        this.password = password;
        this.shippingAddress = shippingAddress;
        this.paymentInformation = paymentInformation;
        this.orderHistory = orderHistory;
        this.cart = cart;
        this.quantities = quantities;
    }

    public boolean loginUser(Database db) {
        return false;
    }

    public boolean signUpUser(Database db) {
        return false;
    }

    public void updateName(String name) {
        this.name = name;
    }

    public void updateEmail(String email) {
        this.email = email;
    }

    public void updateUsername(String username) {
        this.username = username;
    }

    public void updatePassword(String password) {
        this.password = password;
    }

    public void updateShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    public void updatePaymentInformation(PaymentInfo paymentInformation) {
        this.paymentInformation = paymentInformation;
    }

    public void updateOrderHistory(ArrayList<Order> orderHistory) {
        this.orderHistory = orderHistory;
    }

    public void updateCart(ArrayList<Product> cart) {
        this.cart = cart;
    }

    public void addToCart(Product product, int quantity) {
        this.cart.add(product);
        this.quantities.add(quantity);
    }

    public int viewPastOrders() {
        for (Order order : orderHistory) {
            order.viewOrder();
        }

        return orderHistory.size();
    }

    public Order viewOrders(int number) {
        if (number > orderHistory.size()) return null;
        return orderHistory.get(number);
    }

    public UUID getUUID() {
        return uUUID;
    }

    @Override
    public String toString() {
        return "User " + username + "\n-----------------------\n Name : " + name
                + "\n Email : " + email + "\n Password : " + password;

    }

    public ArrayList<String> searchProducts(String query) {
        return new ArrayList<>();
    }
    
    public boolean purchaseProducts() {
        return false;
    }
    public boolean logOffUser(){
        return false;
    }
}
