package gov.iti.jets.controller;

import gov.iti.jets.dto.InventoryDto;
import gov.iti.jets.entity.Inventory;
import gov.iti.jets.service.InventoryService;
import jakarta.ws.rs.*;

@Path("inventories")
public class InventoryController extends BaseControllerImpl<Inventory, InventoryDto, Integer>{

    private InventoryService inventoryService;

    public InventoryController()
    {

        inventoryService = InventoryService.getInstance();
        baseService = inventoryService;
    }

}
