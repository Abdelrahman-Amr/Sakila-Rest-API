package gov.iti.jets.controller;

import gov.iti.jets.dto.AddressDto;
import gov.iti.jets.entity.Address;
import gov.iti.jets.service.AddressService;
import jakarta.ws.rs.Path;

@Path("addresses")
public class AddressController extends BaseControllerImpl<Address, AddressDto, Short> {
    private AddressService addressService;

    public AddressController()
    {

        addressService = AddressService.getInstance();
        baseService = addressService;
    }
}
