package nivell3.interfaces;

import nivell3.modules.Payment;

public interface Callback {
    void notifyShop(Payment payment, boolean success, int refNr);
}
