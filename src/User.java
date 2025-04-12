import java.util.ArrayList;

public class User {
    String name;
    String email;
    String username;
    String password;
    ShippingAddress shippingAddress;
    PaymentInfo paymentInformation;
    ArrayList<Order> orderHistory;
    ArrayList<Product> cart;

    User(
        String name,
        String email,
        String username,
        String password,
        ShippingAddress shippingAddress,
        PaymentInfo paymentInformation,
        ArrayList<Order> orderHistory,
        ArrayList<Product> cart
    ) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.shippingAddress = shippingAddress;
        this.paymentInformation = paymentInformation;
        this.orderHistory = orderHistory;
        this.cart = cart;
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

    public void addToCart(Product product) {
        this.cart.add(product);
    }

    public int viewPastOrders() {
        for (Order order : orderHistory) {
            order.viewOrder();
        }

        return orderHistory.size();
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
