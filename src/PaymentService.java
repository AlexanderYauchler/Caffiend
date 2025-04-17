import java.util.*;

public class PaymentService {
    public List<String> paymentDetails;
    public List<String> transactionHistory;

    public PaymentService() {
        System.out.println("Initialized payment service connection!");
        paymentDetails = new ArrayList<>();
        transactionHistory = new ArrayList<>();
    }

    public boolean paySeller(User user, Seller seller, double amount) {
        if (user.paymentInformation == null) return false;
        if (user.paymentInformation.cardNo == null) return false;
        if (user.paymentInformation.expMonth > 12 || user.paymentInformation.expMonth < 1 || user.paymentInformation.expYear < 2025) return false; // no invalid dates
        if (user.paymentInformation.ccv == null || user.paymentInformation.ccv.length() != 3) return false;
		// Use the username from the User object
		String paymentRecord = "User " + user.username +
				" with card number " + user.paymentInformation.cardNo +
				" paid $" + amount + " to Seller " + seller.name;
		paymentDetails.add(paymentRecord);
		transactionHistory.add(paymentRecord);
		System.out.println(paymentRecord);
		return true;
    }

   public void depositProfit(Seller seller, double amount) {
		String depositRecord = "Deposited $" + amount + " to Seller " + seller.name + "'s account.";
		transactionHistory.add(depositRecord);
		System.out.println(depositRecord);
    }

    public void showTransactionHistory() {
        System.out.println("Transaction History");
        for (String record : transactionHistory) {
            System.out.println(record);
        }
    }
}
