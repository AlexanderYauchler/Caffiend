public class Product {
    String productName;
    double price;
    String description;

    public final String currencyName = "Yuan";
    public final String currencySymbol = "¥";

    Product(
        String productName,
        double price,
        String description
    ) {
        this.productName = productName;
        this.price = price;
        this.description = description;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    @Override
    public String toString() {
        return productName + " - " + this.getCurrencySymbol() + this.price + " | " +  this.description;
    }
}