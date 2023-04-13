package gov.iti.jets.controller;

import gov.iti.jets.dto.StaffDto;
import gov.iti.jets.entity.Staff;
import gov.iti.jets.service.LanguageService;
import gov.iti.jets.service.StaffService;
import gov.iti.jets.service.StoreService;
import jakarta.ws.rs.Path;

@Path("staff")
public class StaffController extends BaseControllerImpl<Staff, StaffDto, Short> {

    private StaffService staffService;

    public StaffController()
    {

        staffService = StaffService.getInstance();
        baseService = staffService;
    }
}
