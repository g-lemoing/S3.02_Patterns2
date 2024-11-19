package nivell3.modules;

import nivell3.interfaces.Callback;

import java.util.Random;

public class PaymentGateway {
    private final Callback callback;

    public PaymentGateway(Callback callback){
        this.callback = callback;
    }

    public void validatePayment(Payment payment){
        System.out.println("Pagament en procés de validació...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        Random random = new Random();
        boolean success = random.nextBoolean();
        int refNr = 0;
        if (success){
            refNr = random.nextInt(1, 99999999);
        }
        System.out.println("Retornant resultat de la validació...");
        callback.notifyShop(payment, success, refNr);
    }
}
