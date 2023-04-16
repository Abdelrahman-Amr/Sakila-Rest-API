package gov.iti.jets.persistence.repositoryImpl;

import gov.iti.jets.entity.Country;
import gov.iti.jets.entity.Customer;
import gov.iti.jets.entity.Film;
import gov.iti.jets.persistence.repository.CustomerRepository;
import gov.iti.jets.persistence.repository.FilmRepository;
import gov.iti.jets.util.MyLocal;

public class CustomerRepositoryImpl extends BaseRepositoryImpl<Customer, Short> implements CustomerRepository {
    public CustomerRepositoryImpl()
    {
        super(Customer.class, MyLocal.getInstance().get());
    }

}
