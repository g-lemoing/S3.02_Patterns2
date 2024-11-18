package nivell3.modules;

public class Payment {
    private final PaymentMethod paymentMethod;
    private final double amount;

    public Payment(double amount, PaymentMethod paymentMethod){
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public double getAmount() {
        return amount;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }
}
