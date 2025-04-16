import java.util.UUID;

public class Product {
    String productName;
    double price;
    String description;

    private UUID PUUID;

    public final String currencyName = "Yuan";
    public final String currencySymbol = "¥";

    static int idNum = 0;

    Product(
        String productName,
        double price,
        String description
    ) {
        this.productName = productName;
        this.PUUID = UUID.randomUUID();
        this.price = price;
        this.description = description;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public UUID getPUUID() {
        return PUUID;
    }

    @Override
    public String toString() {
        return productName + " - " + this.getCurrencySymbol() + this.price + " | " +  this.description;
    }
}
