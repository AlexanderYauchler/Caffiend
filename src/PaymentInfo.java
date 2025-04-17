public class PaymentInfo {
    String cardNo;
    int expMonth;
    int expYear;
    String ccv;

    PaymentInfo(
        String cardNo,
        int expMonth,
        int expYear,
        String ccv
    ) {
        this.cardNo = cardNo;
        this.expMonth = expMonth;
        this.expYear = expYear;
        this.ccv = ccv;
    }
}
