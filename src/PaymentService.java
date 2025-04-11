import java.util.*;

public class PaymentService {
    public List<String> paymentDetails;
    public List<String> transactionHistory;

    public PaymentService() {
        paymentDetails = new ArrayList<>();
        transactionHistory = new ArrayList<>();
    }

    public boolean paySeller(String userId, String sellerId, double amount, PaymentInfo paymentInfo) {
        // Create the payment record using the full card number and other details
        String paymentRecord = "User " + userId +
                " with card number " + paymentInfo.cardNo +
                " paid $" + amount + " to Seller " + sellerId;
        paymentDetails.add(paymentRecord);
        transactionHistory.add(paymentRecord);
        System.out.println(paymentRecord);
        return true;
    }

    public void depositProfit(String sellerId, double amount) {
        String depositRecord = "Deposited $" + amount + " to Seller " + sellerId + "'s account.";
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
