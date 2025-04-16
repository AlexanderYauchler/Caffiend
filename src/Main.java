import java.util.ArrayList;
import java.util.UUID;

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



        // === User Authentication and Profile Management ===

        // Correct user login
        if (database.loginUser(user.username, user.password)) {
            System.out.println("User " + user.username + " logged in successfully!");
        }

        // Incorrect user login
        if (!database.loginUser("username", "password")) {
            System.out.println("Failed to login user " + user.username + "!");
        }

        // Correct seller login
        if (database.loginSeller(seller.username, seller.password)) {
            System.out.println("Seller " + user.username + " logged in successfully!");
        }

        // Incorrect seller login
        if (!database.loginSeller("username", "password")) {
            System.out.println("Failed to login seller " + user.username + "!");
        }

        // Update user password
        user.password = "newPassword";
        System.out.println();



        // === Browse and Search Products ===

        // Single product returned
        System.out.println(
                "Product Search 'Monster Energy Zero Ultra' [1 Result]:\n + " +
                database.searchProducts("Monster Energy Zero Ultra")
        );
        System.out.println();

        // Multiple Products Returned
        ArrayList<Product> products = database.searchProducts("Ultra");
        System.out.println("Product Search 'Ultra' [" + products.size() + " Results]:");
        for (Product p : products) {
            System.out.println(" + " + p);
        }
        System.out.println();

        // No Products Returned
        products = database.searchProducts("Zoob");
        System.out.println("Product Search 'Zoob' [" + products.size() + " Results]:");
        for (Product p : products) {
            System.out.println(" + " + p);
        }
        System.out.println();

        // Empty search (all products)
        products = database.searchProducts("");
        System.out.println("Product Search '' [" + products.size() + " Results]:");
        for (Product p : products) {
            System.out.println(" + " + p);
        }
        System.out.println();

        // Search by description
        products = database.searchProducts("party", true);
        System.out.println("Product Search by description 'party' [" + products.size() + " Results]:");
        for (Product p : products) {
            System.out.println(" + " + p);
        }
        System.out.println();



        // === Add Products to Cart ===

        // Add single product
        products = database.searchProducts("Ultra");
        user.addToCart(products.getFirst(), 1);
        System.out.println("Added 1 of " + products.getFirst().productName + " to " + user.username + "'s cart!");

        // Add multiple of a product
        user.addToCart(products.get(1), 5);
        System.out.println("Added 5 of " + products.get(1).productName + " to " + user.username + "'s cart!");

        // Add negative of a product
        user.addToCart(products.getFirst(), -1);
        System.out.println("Added -1 of " + products.getFirst().productName + " to " + user.username + "'s cart!");

        // Add int limit of a product
        user.addToCart(products.getFirst(), 2147483647);
        System.out.println("Added 2147483647 of " + products.getFirst().productName + " to " + user.username + "'s cart!");

        // Add zero of a product
        user.addToCart(products.getFirst(), 0);
        System.out.println("Added 0 of " + products.getFirst().productName + " to " + user.username + "'s cart!");
        System.out.println();



        // === Make Payment ===

        // Successful Payment
        // TODO

        // No Card Number
        // TODO

        // No Expiration Date
        // TODO

        // No CCV
        // TODO

        // No Card Information
        // TODO
        System.out.println();


        // === List Products ===

        // Create "new" products
        ArrayList<Product> newProducts = new ArrayList<>();
        for (Product p : products) {
            Product upper = new Product(
                    p.productName.toUpperCase(),
                    p.price,
                    p.description
            );
            newProducts.add(upper);
        }

        // Seller Adds Single Product
        UUID singleUUID = database.addProduct(newProducts.get(0), seller);
        System.out.println(seller.username + " listed product " + singleUUID.toString() + "!");

        // Seller Adds Multiple Products
        ArrayList<UUID> multipleUUID = database.addProducts(new ArrayList<>(newProducts.subList(1, newProducts.size())), seller);
        for (UUID uuid : multipleUUID) {
            System.out.println(seller.username + " listed product " + uuid + "!");
        }
        System.out.println();

        // Seller Removes Single Product
        if (database.removeProduct(singleUUID, seller)) {
            System.out.println(seller.username + " unlisted product " + singleUUID + "!");
        } else {
            System.out.println(seller.username + " failed to remove product " + singleUUID + "!");
        }

        // Seller Removes Multiple Products
        ArrayList<Boolean> res = database.removeProducts(multipleUUID, seller);
        for (int i = 0; i < res.size(); i++) {
            if (res.get(i)) {
                System.out.println(seller.username + " unlisted product #" + multipleUUID.get(i) + "!");
            } else {
                System.out.println(seller.username + " failed to remove product " + multipleUUID.get(i) + "!");
            }
        }
        System.out.println();

        // Seller Adds Invalid Product
        singleUUID = database.addProduct(null, seller);
        if (singleUUID == null) {
            System.out.println(seller.username + " failed to list product!");
        }
        System.out.println();



        // === Manage Orders ===

        // User Creates Order
        Order order = new Order(user.cart, user.quantities, user.shippingAddress);

        // User Creates Invalid Order
        order = new Order(null, null, null);

        // User Views Order History
        user.viewPastOrders();

        // Seller Views Order History
        seller.viewSellHistory();
        System.out.println();

        // User Views Specific Order
        user.getOrder(0).viewOrder();
        System.out.println();



        // === Order Tracking and Delivery Updates ===

        order = new Order(user.cart, user.quantities, user.shippingAddress);
        shippingService.shipPackage(user.username, "FedEx", ShippingStatus.WAITING_TO_SHIP, order);

        // Set courier to UPS
        // TODO

        // Get Shipping Status of Product
        // TODO

        // Get Shipping Status of Invalid Product
        // TODO

        // Set Shipping Status to "In-Transit"
        // TODO

        // Set Invalid Courier
        // TODO
        System.out.println();



        // === Moderate Platform ===

        User newUser = new User();
        ArrayList<User> newUsers = new ArrayList<>();
        ArrayList<UUID> newUserUUIDs = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            newUsers.add(new User());
            newUserUUIDs.add(newUsers.getLast().getUUID());
        }

        Seller newSeller = new Seller();
        ArrayList<Seller>  newSellers = new ArrayList<>();
        ArrayList<UUID> newSellerUUIDs = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            newSellers.add(new Seller());
            newSellerUUIDs.add(newSellers.getLast().getUUID());
        }

        // Add Single User
        database.addUser(newUser);
        System.out.println("Added user " + newUser.username + "!");

        // Remove Single User
        database.removeUser(newUser.getUUID());
        System.out.println("Removed user " + newUser.username + "!");
        System.out.println();

        // Add Multiple Users
        database.addUsers(newUsers);
        for (User u : newUsers) {
            System.out.println("Added user " + u.username + "!");
        }
        System.out.println();

        // Remove Multiple Users
        database.removeUsers(newUserUUIDs);
        for (User u : newUsers) {
            System.out.println("Removed user " + u.username + "!");
        }
        System.out.println();

        // Add Single Seller
        database.addSeller(newSeller);
        System.out.println("Added seller " + newSeller.username + "!");

        // Remove Single Seller
        database.removeSeller(newSeller.getUUID());
        System.out.println("Removed seller " + newSeller.username + "!");
        System.out.println();

        // Add Multiple Sellers
        database.addSellers(newSellers);
        for (Seller s : newSellers) {
            System.out.println("Added seller " + s.username + "!");
        }
        System.out.println();

        // Remove Multiple Sellers
        database.removeSellers(newSellerUUIDs);
        for (Seller s : newSellers) {
            System.out.println("Removed seller " + s.username + "!");
        }
    }
}