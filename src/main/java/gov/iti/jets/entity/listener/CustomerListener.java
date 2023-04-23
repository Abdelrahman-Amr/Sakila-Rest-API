package gov.iti.jets.entity.listener;

import gov.iti.jets.entity.Customer;
import jakarta.persistence.*;

import java.time.LocalDateTime;

public class CustomerListener {

    @PrePersist
    public void setCustomerCreateDate(Customer customer)
    {
        customer.setCreateDate(LocalDateTime.now());
    }




}
