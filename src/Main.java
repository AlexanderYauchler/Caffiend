public class Main {
    public static void main(String[] args) {
        // Dummy backend services
        Database database = new Database();
        ShippingService shippingService = new ShippingService();
        PaymentService paymentService = new PaymentService();

        // Retrieve user reference from database
        User johnSmith = database.getUserByUsername("JohnSmith");
        System.out.println("Retrieved user!");
        System.out.println(johnSmith);
    }
}