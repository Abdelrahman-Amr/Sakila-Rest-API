package gov.iti.jets.persistence.repository;

import gov.iti.jets.dto.CustomerDto;
import gov.iti.jets.entity.Customer;

import java.util.List;

public interface CustomerRepository extends BaseRepository<Customer, Short>{

    public List<Customer> findByName(String name);
}
