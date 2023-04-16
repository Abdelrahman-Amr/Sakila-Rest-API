package gov.iti.jets.controller;

import gov.iti.jets.dto.RentalDto;
import gov.iti.jets.entity.Rental;
import gov.iti.jets.service.CustomerService;
import gov.iti.jets.service.RentalService;
import jakarta.ws.rs.Path;

@Path("rentals")
public class RentalController extends BaseControllerImpl<Rental, RentalDto, Integer>{
    private RentalService rentalService;

    public RentalController ()
    {
        rentalService = RentalService.getInstance();
        baseService = rentalService;
    }
}
