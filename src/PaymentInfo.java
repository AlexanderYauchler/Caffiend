public class PaymentInfo {
    String cardNo;
    int expMonth;
    int expYear;
    int ccv;

    PaymentInfo(
        String cardNo,
        int expMonth,
        int expYear,
        int ccv
    ) {
        this.cardNo = cardNo;
        this.expMonth = expMonth;
        this.expYear = expYear;
        this.ccv = ccv;
    }
}
