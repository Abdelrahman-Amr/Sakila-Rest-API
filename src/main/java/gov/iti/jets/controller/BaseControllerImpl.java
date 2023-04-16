package gov.iti.jets.controller;

import gov.iti.jets.dto.BaseDto;
import gov.iti.jets.entity.BaseEntity;
import gov.iti.jets.service.BaseService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

public class BaseControllerImpl<E extends BaseEntity, D extends BaseDto, T> implements BaseController<E, D, T>{
    protected BaseService<E, D, T> baseService;
    @Override
    @GET
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response findById(@PathParam("id") T id) {
        D dto = baseService.findById(id);
        return  Response.accepted().entity(dto).build();
    }

    @Override
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response findAll() {
        List<D> dtos = baseService.findAll();
        return  Response.accepted().entity(dtos).build();
    }
    @GET
    @Path("/getPage")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response getPage(@QueryParam("page") int page, @QueryParam("limit") int limit)
    {
        List<D> dtos = baseService.getPage(page, limit);
        return  Response.accepted().entity(dtos).build();
    }

    @Override
        @POST
        @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
        @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
        public Response add(D dto) {
            D savedDto = baseService.add(dto);
            return  Response.accepted().entity(savedDto).build();
        }
        @Override
        @PUT
        @Path("{id}")
        @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
        @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
        public Response update(@PathParam("id") T id,  D dto)
        {
            D savedDto = baseService.update(id, dto);
            return  Response.accepted().entity(savedDto).build();
        }

    @DELETE
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response deleteById(@PathParam("id") T id)
    {
        D dto = baseService.deleteById(id);
        return  Response.accepted().entity(dto).build();
    }
}
