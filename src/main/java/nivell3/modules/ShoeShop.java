package nivell3.modules;

import nivell3.interfaces.Callback;

public class ShoeShop implements Callback {
    PaymentGateway paymentGateway = new PaymentGateway(this);

    @Override
    public void notifyShop(Payment payment, boolean success, int refNr) {
        if (success){
            System.out.println("Transacció d'import " + payment.getAmount()
                    + "€ per " +  payment.getPaymentMethod()
                    + " correctament realitzada amb referència " + refNr + ".");
        }else{
            System.out.println("Transacció denegada.");
        }
    }

    public void callValidatePayment(Payment payment){
        paymentGateway.validatePayment(payment);
    }
}
