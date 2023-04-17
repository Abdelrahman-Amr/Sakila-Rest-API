package gov.iti.jets.controller;

import gov.iti.jets.dto.StaffDto;
import gov.iti.jets.entity.Staff;
import gov.iti.jets.persistence.repositoryImpl.StaffRepositoryImpl;
import gov.iti.jets.service.LanguageService;
import gov.iti.jets.service.StaffService;
import gov.iti.jets.service.StoreService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;

@Path("staff")
public class StaffController extends BaseControllerImpl<Staff, StaffDto, Short> {

    private StaffService staffService;

    public StaffController()
    {

        staffService = StaffService.getInstance();
        baseService = staffService;
    }

    @GET
    @Path("/getPicture/{id}")
    public Response getStaffPicture(@PathParam("id") short id)
    {
        byte[] picture = staffService.getStaffPicture(id);
        return  Response.accepted().entity(picture).build();
    }
}
