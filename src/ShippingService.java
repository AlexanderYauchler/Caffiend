import java.util.*;

enum ShippingStatus {
    WAITING_TO_SHIP,
    IN_TRANSIT,
    ARRIVED
}

public class ShippingService {

    // Internal class to hold shipping records
    static class ShippingRecord {
        String username;
        String courier;
        ShippingStatus status;
        ShippingAddress address;
        ArrayList<Product> items;
        Date shippedOn;

        public ShippingRecord(String username, String courier, ShippingStatus status, ShippingAddress address, ArrayList<Product> items, Date shippedOn) {
            this.username = username;
            this.courier = courier;
            this.status = status;
            this.address = address;
            this.items = new ArrayList<Product>();
            this.shippedOn = shippedOn;
        }

        @Override
        public String toString() {
            return "Shipped to: " + username +
                    " | Address: " + address +
                    " | Items: " + items +
                    " | Date: " + shippedOn;
        }
    }

    private Database database;
    private List<ShippingRecord> shippingHistory;

    public ShippingService(Database db) {
        System.out.println("Initialized shipping service connection!");
        this.database = db;
        this.shippingHistory = new ArrayList<>();
    }

    // Method to simulate shipping a package for a user
    public void shipPackage(String username, String courier, ShippingStatus status, Order order) {
        ShippingAddress shippingAddress = database.getUserByUsername(username).getShippingAddress();

        if (shippingAddress == null) {
            System.out.println("Shipping address not found for user: " + username);
            return;
        }

        if (order == null || order.getCart().isEmpty()) {
            System.out.println("No items to ship for user: " + username);
            return;
        }

        // Simulate shipping
        ShippingRecord record = new ShippingRecord(username, courier, status, shippingAddress, order.getCart(), new Date());
        shippingHistory.add(record);

        System.out.println("Package shipped successfully to " + username);
    }

    // Method to show shipping history for a specific user
    public List<String> showShippingHistory(String username) {
        List<String> history = new ArrayList<>();
        for (ShippingRecord record : shippingHistory) {
            if (record.username.equals(username)) {
                history.add(record.toString());
            }
        }

        return history;
    }
}
