import java.util.ArrayList;
import java.util.Random;
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

    public User() {
        Random random = new Random();

        // Randomly generate name, email, username, and password
        this.name = "User" + random.nextInt(1000);
        this.email = "user" + random.nextInt(1000) + "@example.com";
        this.username = "user" + random.nextInt(1000);
        this.password = generateRandomPassword();

        // Random UUID for user
        this.uUUID = UUID.randomUUID();

        // Create random shipping address
        this.shippingAddress = new ShippingAddress(
                "Street " + random.nextInt(100),
                "City " + random.nextInt(100),
                "State " + random.nextInt(50),
                "Country " + random.nextInt(50),
                "ZIP" + random.nextInt(10000)
        );

        // Create random payment info
        this.paymentInformation = new PaymentInfo(
                "4111111111111111",  // Just a placeholder for a valid-looking card number
                random.nextInt(12) + 1,  // Month
                2025 + random.nextInt(5),  // Year (current year + 0 to 5 years)
                Integer.toString(random.nextInt(1000) + 100)  // CVV
        );

        // Random order history and cart initialization
        this.orderHistory = new ArrayList<>();
        this.cart = new ArrayList<>();
        this.quantities = new ArrayList<>();

        // Optionally, add a random product to the cart
        Product randomProduct = new Product("Product" + random.nextInt(1000), random.nextDouble() * 100, "Random product description");
        this.cart.add(randomProduct);
        this.quantities.add(random.nextInt(5) + 1);  // Random quantity from 1 to 5
    }

    private String generateRandomPassword() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder password = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            password.append(characters.charAt(random.nextInt(characters.length())));
        }
        return password.toString();
    }

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

    public void viewPastOrders() {
        for (Order order : orderHistory) {
            order.viewOrder();
        }
    }

    public Order getOrder(int number) {
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
