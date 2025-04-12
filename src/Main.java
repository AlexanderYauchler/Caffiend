import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        // Backend services
        Database database = new Database();
        ShippingService shippingService = new ShippingService(database);
        PaymentService paymentService = new PaymentService();
        System.out.println();

        // Retrieve seller reference from database
        Seller seller = database.getSellerByName("Alice Johnson");

        // Retrieve user reference from database and login
        User user = database.getUserByUsername("JohnSmith");
        if (!database.loginUser(user.username, user.password)) {
            throw new Exception("Failed to login user " + user.username + "!");
        }

        System.out.println("Logged in user " + user.username + "!");
        System.out.println();

        // Search products
        System.out.println("Searching products for: 'Ultra'");
        ArrayList<Product> products = database.searchProducts("Ultra");
        for (Product product : products) {
            System.out.println(" + " + product);
        }

        // Create order
        user.addToCart(products.getFirst());
        Order order = new Order(user.cart, new ArrayList<>(List.of(4)), user.shippingAddress);
        System.out.println();

        // Purchase & fulfillment
        paymentService.paySeller(user, seller, products.getFirst().price);
        shippingService.shipPackage(user.username, order);
    }
}