import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class Seller {
    String name;
    String email;
    String username;
    String password;
    ShippingAddress shippingAddress;
    Double prices;
    ArrayList<Product> products;
    ArrayList<Product> soldProducts;
    PaymentInfo paymentInformation;

    private UUID sUUID;

    public Seller() {
        Random random = new Random();

        // Randomly generate name, email, username, and password
        this.name = "Seller" + random.nextInt(1000);
        this.email = "seller" + random.nextInt(1000) + "@example.com";
        this.username = "seller" + random.nextInt(1000);
        this.password = generateRandomPassword();

        // Random UUID for seller
        this.sUUID = UUID.randomUUID();

        // Create random shipping address
        this.shippingAddress = new ShippingAddress(
                "Street " + random.nextInt(100),
                "City " + random.nextInt(100),
                "State " + random.nextInt(50),
                "Country " + random.nextInt(50),
                "ZIP" + random.nextInt(10000)
        );

        // Random price for products
        this.prices = random.nextDouble() * 100;

        // Create random payment info
        this.paymentInformation = new PaymentInfo(
                "4111111111111111",  // Just a placeholder for a valid-looking card number
                random.nextInt(12) + 1,  // Month
                2025 + random.nextInt(5),  // Year (current year + 0 to 5 years)
                Integer.toString(random.nextInt(1000) + 100)  // CVV
        );

        // Initialize products and soldProducts as empty lists
        this.products = new ArrayList<>();
        this.soldProducts = new ArrayList<>();

        // Optionally, add a random product to products
        Product randomProduct = new Product("Product" + random.nextInt(1000), random.nextDouble() * 100, "Random product description");
        this.products.add(randomProduct);
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

    Seller(
            String name,
            String email,
            String username,
            String password,
            ShippingAddress shippingAddress,
            double prices,
            PaymentInfo paymentInformation,
            ArrayList<Product> products,
            ArrayList<Product> soldProducts
    ) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.sUUID = UUID.randomUUID();
        this.password = password;
        this.shippingAddress = shippingAddress;
        this.paymentInformation = paymentInformation;
        this.products = products;
        this.soldProducts = soldProducts;
    }
    public boolean loginSeller(){
        return false;
    }
    public boolean updateProfileDetails(){
        return false;
    }
    public boolean updateListingDetails(){
        return false;
    }
    public int viewSellHistory(){
        //Past Orders from soldProducts
        return soldProducts.size();
    }
    public boolean logOffSeller(){
        return false;
    }
    public UUID getUUID() {
        return sUUID;
    }
}
