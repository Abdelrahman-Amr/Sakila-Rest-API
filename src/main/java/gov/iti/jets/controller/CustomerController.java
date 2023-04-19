package gov.iti.jets.controller;

import gov.iti.jets.dto.ActorDto;
import gov.iti.jets.dto.CustomerDto;
import gov.iti.jets.entity.Customer;
import gov.iti.jets.service.CustomerService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("customers")
public class CustomerController extends BaseControllerImpl<Customer, CustomerDto, Short>{
    private CustomerService customerService;

    public CustomerController ()
    {
        customerService = CustomerService.getInstance();
        baseService = customerService;
    }

    @GET
    @Path("/filter")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response findByName(@QueryParam("name") String name)
    {
        List<CustomerDto> customerDtos = customerService.findByName(name);
        return  Response.accepted().entity(customerDtos).build();

    }
}
