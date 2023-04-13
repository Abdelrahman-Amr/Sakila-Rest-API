package gov.iti.jets.controller;

import gov.iti.jets.dto.StoreDto;
import gov.iti.jets.entity.Store;
import gov.iti.jets.service.StaffService;
import gov.iti.jets.service.StoreService;
import jakarta.ws.rs.Path;

@Path("stores")
public class StoreController extends BaseControllerImpl<Store, StoreDto, Short>{
    private StoreService storeService;

    public StoreController()
    {

        storeService = StoreService.getInstance();
        baseService = storeService;
    }

}
