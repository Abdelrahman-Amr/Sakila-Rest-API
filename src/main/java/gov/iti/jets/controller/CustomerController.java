package gov.iti.jets.controller;

import gov.iti.jets.dto.CustomerDto;
import gov.iti.jets.entity.Customer;
import gov.iti.jets.service.CustomerService;
import jakarta.ws.rs.Path;

@Path("customers")
public class CustomerController extends BaseControllerImpl<Customer, CustomerDto, Short>{
    private CustomerService customerService;

    public CustomerController ()
    {
        customerService = CustomerService.getInstance();
        baseService = customerService;
    }
}
