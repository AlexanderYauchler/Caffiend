import java.util.ArrayList;

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
        this.password = password;
        this.shippingAddress = shippingAddress;
        this.paymentInformation = paymentInformation;
        this.products = products;
        this.soldProducts = soldProducts;
    }

    public boolean updateProfileDetails(){
        return false;
    }

    public boolean updateListingDetails(){
        return false;
    }

    public int viewSellHistory(){
        //P ast Orders from soldProducts
        return soldProducts.size();
    }
}
