import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

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
                                    672
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
}
