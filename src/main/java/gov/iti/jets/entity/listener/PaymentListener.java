package gov.iti.jets.entity.listener;

import gov.iti.jets.entity.Payment;
import jakarta.persistence.PrePersist;

import java.time.LocalDateTime;

public class PaymentListener {

    @PrePersist
    public void setPaymentDate(Payment payment)
    {
        payment.setPaymentDate(LocalDateTime.now());
    }
}
