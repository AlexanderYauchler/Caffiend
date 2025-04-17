import java.util.*;

public class Database {
    ArrayList<User> users = new ArrayList<>(
            List.of(
                    new User(
                            "John Smith",
                            "john.smith@hotmail.com",
                            "JohnSmith",
                            "MyPassword1",
                            new ShippingAddress(
                                    "3859 Lockman Cliff",
                                    "East Rhianna",
                                    "New Mexico",
                                    "United States",
                                    "04962-6323"
                            ),
                            new PaymentInfo(
                                    "4032039269355774",
                                    2,
                                    2028,
                                    "672"
                            ),
                            new ArrayList<>(
                                    List.of(
                                            new Order(
                                                    new ArrayList<>(
                                                            List.of(
                                                                    new Product(
                                                                            "Monster Energy Zero Ultra",
                                                                            22,
                                                                            "Some people are impossible to please. As soon as they get what they thought they wanted they always want more. Our team riders and Monster Girls are no different… they`ve been dropping some hints lately. They`ve been asking us for a new Monster drink. A little less sweet, lighter-tasting, zero calories, but with a full load of our Monster energy blend. Sure, white is the new black. We went all out: Monster Energy Zero Ultra."
                                                                    )
                                                            )
                                                    ),
                                                    new ArrayList<>(
                                                            List.of(
                                                                    7
                                                            )
                                                    ),
                                                    new ShippingAddress(
                                                            "3859 Lockman Cliff",
                                                            "East Rhianna",
                                                            "New Mexico",
                                                            "United States",
                                                            "04962-6323"
                                                    )
                                            )
                                    )
                            ),
                            new ArrayList<>(),
                            new ArrayList<>()
                    ),
                    new User(
                            "Jane Doe",
                            "jane.doe@gmail.com",
                            "JaneDoe",
                            "SecurePass123",
                            new ShippingAddress(
                                    "742 Evergreen Terrace",
                                    "Springfield",
                                    "Illinois",
                                    "United States",
                                    "62704"
                            ),
                            new PaymentInfo(
                                    "4716108999716531",
                                    11,
                                    2026,
                                    "123"
                            ),
                            new ArrayList<>(
                                    List.of(
                                            new Order(
                                                    new ArrayList<>(
                                                            List.of(
                                                                    new Product(
                                                                            "Ultra Red Monster Energy 24 Pack",
                                                                            500,
                                                                            "Change can be a good thing when you make the most of it…like those endless summers working mindless jobs. They pay just enough to survive (party), but somehow you save enough for that last road trip before starting “real life.” In homage to coming of age in America and in keeping with our Monster family tradition, comes another change worth making. White, Blue, and now Ultra Red Monster: Light, crisp, refreshing with zero calories and zero sugar. Made right here in the USA."
                                                                    )
                                                            )
                                                    ),
                                                    new ArrayList<>(
                                                            List.of(
                                                                    3
                                                            )
                                                    ),
                                                    new ShippingAddress(
                                                            "742 Evergreen Terrace",
                                                            "Springfield",
                                                            "Illinois",
                                                            "United States",
                                                            "62704"
                                                    )
                                            )
                                    )
                            ),
                            new ArrayList<>(),
                            new ArrayList<>()
                    ),
                    new User(
                            "No Card Holder",
                            "nocard.holder@gmail.com",
                            "nocard",
                            "pass123",
                            new ShippingAddress(
                                    "742 Evergreen Terrace",
                                    "Springfield",
                                    "Illinois",
                                    "United States",
                                    "62704"
                            ),
                            null,
                            new ArrayList<>(
                                    List.of(
                                            new Order(
                                                    new ArrayList<>(
                                                            List.of(
                                                                    new Product(
                                                                            "Ultra Red Monster Energy 24 Pack",
                                                                            500,
                                                                            "Change can be a good thing when you make the most of it…like those endless summers working mindless jobs. They pay just enough to survive (party), but somehow you save enough for that last road trip before starting “real life.” In homage to coming of age in America and in keeping with our Monster family tradition, comes another change worth making. White, Blue, and now Ultra Red Monster: Light, crisp, refreshing with zero calories and zero sugar. Made right here in the USA."
                                                                    )
                                                            )
                                                    ),
                                                    new ArrayList<>(
                                                            List.of(
                                                                    3
                                                            )
                                                    ),
                                                    new ShippingAddress(
                                                            "742 Evergreen Terrace",
                                                            "Springfield",
                                                            "Illinois",
                                                            "United States",
                                                            "62704"
                                                    )
                                            )
                                    )
                            ),
                            new ArrayList<>(),
                            new ArrayList<>()
                    ),
                    new User(
                            "Expired Card Holder",
                            "expiredcardholder@gmail.com",
                            "mycardisfraud",
                            "oopsies123",
                            new ShippingAddress(
                                    "742 Evergreen Terrace",
                                    "Springfield",
                                    "Illinois",
                                    "United States",
                                    "62704"
                            ),
                            new PaymentInfo(
                                    "4716108999716531",
                                    11,
                                    2023,
                                    "123"
                            ),
                            new ArrayList<>(
                                    List.of(
                                            new Order(
                                                    new ArrayList<>(
                                                            List.of(
                                                                    new Product(
                                                                            "Ultra Red Monster Energy 24 Pack",
                                                                            500,
                                                                            "Change can be a good thing when you make the most of it…like those endless summers working mindless jobs. They pay just enough to survive (party), but somehow you save enough for that last road trip before starting “real life.” In homage to coming of age in America and in keeping with our Monster family tradition, comes another change worth making. White, Blue, and now Ultra Red Monster: Light, crisp, refreshing with zero calories and zero sugar. Made right here in the USA."
                                                                    )
                                                            )
                                                    ),
                                                    new ArrayList<>(
                                                            List.of(
                                                                    3
                                                            )
                                                    ),
                                                    new ShippingAddress(
                                                            "742 Evergreen Terrace",
                                                            "Springfield",
                                                            "Illinois",
                                                            "United States",
                                                            "62704"
                                                    )
                                            )
                                    )
                            ),
                            new ArrayList<>(),
                            new ArrayList<>()
                    ),
                    new User(
                            "Missing Card Number",
                            "nonumber@gmail.com",
                            "badnum",
                            "badpass123",
                            new ShippingAddress(
                                    "742 Evergreen Terrace",
                                    "Springfield",
                                    "Illinois",
                                    "United States",
                                    "62704"
                            ),
                            new PaymentInfo(
                                    null,
                                    11,
                                    2026,
                                    "123"
                            ),
                            new ArrayList<>(
                                    List.of(
                                            new Order(
                                                    new ArrayList<>(
                                                            List.of(
                                                                    new Product(
                                                                            "Ultra Red Monster Energy 24 Pack",
                                                                            500,
                                                                            "Change can be a good thing when you make the most of it…like those endless summers working mindless jobs. They pay just enough to survive (party), but somehow you save enough for that last road trip before starting “real life.” In homage to coming of age in America and in keeping with our Monster family tradition, comes another change worth making. White, Blue, and now Ultra Red Monster: Light, crisp, refreshing with zero calories and zero sugar. Made right here in the USA."
                                                                    )
                                                            )
                                                    ),
                                                    new ArrayList<>(
                                                            List.of(
                                                                    3
                                                            )
                                                    ),
                                                    new ShippingAddress(
                                                            "742 Evergreen Terrace",
                                                            "Springfield",
                                                            "Illinois",
                                                            "United States",
                                                            "62704"
                                                    )
                                            )
                                    )
                            ),
                            new ArrayList<>(),
                            new ArrayList<>()
                    ),
                    new User(
                            "no ccv megamind",
                            "whatsaccv@gmail.com",
                            "noccv",
                            "caffiend123",
                            new ShippingAddress(
                                    "742 Evergreen Terrace",
                                    "Springfield",
                                    "Illinois",
                                    "United States",
                                    "62704"
                            ),
                            new PaymentInfo(
                                    "4716108999716531",
                                    11,
                                    2026,
                                    null
                            ),
                            new ArrayList<>(
                                    List.of(
                                            new Order(
                                                    new ArrayList<>(
                                                            List.of(
                                                                    new Product(
                                                                            "Ultra Red Monster Energy 24 Pack",
                                                                            500,
                                                                            "Change can be a good thing when you make the most of it…like those endless summers working mindless jobs. They pay just enough to survive (party), but somehow you save enough for that last road trip before starting “real life.” In homage to coming of age in America and in keeping with our Monster family tradition, comes another change worth making. White, Blue, and now Ultra Red Monster: Light, crisp, refreshing with zero calories and zero sugar. Made right here in the USA."
                                                                    )
                                                            )
                                                    ),
                                                    new ArrayList<>(
                                                            List.of(
                                                                    3
                                                            )
                                                    ),
                                                    new ShippingAddress(
                                                            "742 Evergreen Terrace",
                                                            "Springfield",
                                                            "Illinois",
                                                            "United States",
                                                            "62704"
                                                    )
                                            )
                                    )
                            ),
                            new ArrayList<>(),
                            new ArrayList<>()
                    )
            )
    );

    ArrayList<Product> products = new ArrayList<>(
            List.of(
                    new Product(
                            "Monster Energy Zero Ultra",
                            22,
                            "Some people are impossible to please. As soon as they get what they thought they wanted they always want more. Our team riders and Monster Girls are no different… they`ve been dropping some hints lately. They`ve been asking us for a new Monster drink. A little less sweet, lighter-tasting, zero calories, but with a full load of our Monster energy blend. Sure, white is the new black. We went all out: Monster Energy Zero Ultra."
                    ),
                    new Product(
                                "Ultra Red Monster",
                                22,
                                "Tear into a can of the meanest energy supplement on the planet, Monster Energy. It’s the ideal combo of the right ingredients in the right proportion to deliver the big bad buzz that only Monster can. Monster packs a powerful punch but has a smooth easy drinking flavor. Athletes, musicians, anarchists, co-ed’s, road warriors, metal heads, geeks, hipsters, and bikers dig it - you will too."
                    ),
                    new Product(
                                "Ultra Red Monster Energy 24 Pack",
                                500,
                                "Change can be a good thing when you make the most of it…like those endless summers working mindless jobs. They pay just enough to survive (party), but somehow you save enough for that last road trip before starting “real life.” In homage to coming of age in America and in keeping with our Monster family tradition, comes another change worth making. White, Blue, and now Ultra Red Monster: Light, crisp, refreshing with zero calories and zero sugar. Made right here in the USA."
                    ),
                    new Product(
                                "Reserve Watermelon Monster",
                                22,
                                "Monster Rehab Watermelon (15.5oz)"
                    ),
                    new Product(
                                "Ultra Rosa Monster",
                                22,
                                "Some people are impossible to please. As soon as they get what they thought they wanted they always want more. Our team athletes and Monster Girls are no different… they dropped some hints back in 2012 for a new Monster drink – a little less sweet, lighter-tasting, 10 calories, but with a full load of our Monster energy blend. We delivered, but didn’t stop there. A new product line was unleashed and we’ve been blowing it up ever since. So go ahead, find your favorite not-so-guilty pleasure… Unleash the Ultra Beast!"
                    )
            )
    );

    ArrayList<Seller> sellers = new ArrayList<>(
            List.of(
                    new Seller(
                            "Alice Johnson",
                            "alice.johnson@marketplace.com",
                            "AliceJ",
                            "StrongPass456",
                            new ShippingAddress(
                                    "123 Maple Street",
                                    "Brookfield",
                                    "Wisconsin",
                                    "United States",
                                    "53005"
                            ),
                            22.0,
                            new PaymentInfo(
                                    "6011345698765432",
                                    8,
                                    2027,
                                    "456"
                            ),
                            new ArrayList<>(
                                    List.of(
                                            new Product(
                                                    "Monster Energy Zero Ultra",
                                                    22,
                                                    "Some people are impossible to please. As soon as they get what they thought they wanted they always want more. Our team riders and Monster Girls are no different… they`ve been dropping some hints lately. They`ve been asking us for a new Monster drink. A little less sweet, lighter-tasting, zero calories, but with a full load of our Monster energy blend. Sure, white is the new black. We went all out: Monster Energy Zero Ultra."
                                            ),
                                            new Product(
                                                    "Ultra Red Monster",
                                                    22,
                                                    "Tear into a can of the meanest energy supplement on the planet, Monster Energy. It’s the ideal combo of the right ingredients in the right proportion to deliver the big bad buzz that only Monster can. Monster packs a powerful punch but has a smooth easy drinking flavor. Athletes, musicians, anarchists, co-ed’s, road warriors, metal heads, geeks, hipsters, and bikers dig it - you will too."
                                            )
                                    )
                            ),
                            new ArrayList<>()
                    )
            )
    );

    public Database() {
        System.out.println("Initialized database connection!");
    }


    public User getUserByName(String name) {
        for (User u : users) {
            if (Objects.equals(u.name, name)) {
                return u;
            }
        }

        return null;
    }

    public User getUserByUsername(String username) {
        for (User u : users) {
            if (Objects.equals(u.username, username)) {
                return u;
            }
        }

        return null;
    }

    public boolean loginUser(String username, String password) {
        for (User u : users) {
            if (u.username.equals(username) && u.password.equals(password)) {
                return true;
            }
        }
        return false;
    }

    public boolean loginSeller(String username, String password) {
        for (Seller s : sellers) {
            if (s.username.equals(username) && s.password.equals(password)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Product> searchProducts(String search) {
        return searchProducts(search, false);
    }

    public ArrayList<Product> searchProducts(String name, boolean byDescription) {
        ArrayList<Product> res = new ArrayList<>();
        if (byDescription) {
            for (Product p : products) {
                if (p.description.contains(name)) {
                    res.add(p);
                }
            }
        } else {
            for (Product p : products) {
                if (p.productName.contains(name)) {
                    res.add(p);
                }
            }
        }
        return res;
    }

    public Seller getSellerByName(String name) {
        for (Seller s : sellers) {
            if (s.name.equals(name)) {
                return s;
            }
        }
        return null;
    }

    public UUID addProduct(Product product, Seller seller) {
        if (product == null) return null;
        if (product.productName.isEmpty()) return null;
        if (product.description.isEmpty()) return null;
        if (product.price <= 0) return null;
        if (products.contains(product)) return null;
        products.add(product);
        seller.products.add(product);
        return product.getPUUID();
    }

    public ArrayList<UUID> addProducts(ArrayList<Product> products, Seller seller) {
        ArrayList<UUID> uuids = new ArrayList<>();
        for (Product product : products) {
            UUID tU = addProduct(product, seller);
            if (tU == null) continue;
            uuids.add(tU);
        }
        return uuids;
    }

    public boolean removeProduct(UUID productUUID, Seller seller) {
        return products.removeIf(prod -> prod.getPUUID().equals(productUUID)) &&
               seller.products.removeIf(prod -> prod.getPUUID().equals(productUUID));
    }

    public ArrayList<Boolean> removeProducts(ArrayList<UUID> productUUIDs, Seller seller) {
        ArrayList<Boolean> x = new ArrayList<>();
        for (UUID uuid : productUUIDs) {
            x.add(removeProduct(uuid, seller));
        }
        return x;
    }

    public UUID addUser(User user) {
        if (user == null) return null;
        if (users.contains(user)) return null;
        users.add(user);
        return user.getUUID();
    }

    public ArrayList<UUID> addUsers(ArrayList<User> users) {
        ArrayList<UUID> uuids = new ArrayList<>();
        for (User user : users) {
            UUID tU = addUser(user);
            if (tU == null) continue;
            uuids.add(tU);
        }
        return uuids;
    }

    public boolean removeUser(UUID userUUID) {
        return users.removeIf(user -> user.getUUID().equals(userUUID));
    }

    public ArrayList<Boolean> removeUsers(ArrayList<UUID> userUUIDs) {
        ArrayList<Boolean> x = new ArrayList<>();
        for (UUID uuid : userUUIDs) {
            x.add(removeUser(uuid));
        }
        return x;
    }

    public UUID addSeller(Seller seller) {
        if (seller == null) return null;
        if (sellers.contains(seller)) return null;
        sellers.add(seller);
        return seller.getUUID();
    }

    public ArrayList<UUID> addSellers(ArrayList<Seller> sellers) {
        ArrayList<UUID> uuids = new ArrayList<>();
        for (Seller s : sellers) {
            UUID tU = addSeller(s);
            if (tU == null) continue;
            uuids.add(tU);
        }
        return uuids;
    }

    public boolean removeSeller(UUID sellerUUID) {
        return sellers.removeIf(sel -> sel.getUUID().equals(sellerUUID));
    }

    public ArrayList<Boolean> removeSellers(ArrayList<UUID> sellerUUIDs) {
        ArrayList<Boolean> x = new ArrayList<>();
        for (UUID uuid : sellerUUIDs) {
            x.add(removeSeller(uuid));
        }
        return x;
    }
}
