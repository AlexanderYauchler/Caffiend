import java.util.ArrayList;
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
