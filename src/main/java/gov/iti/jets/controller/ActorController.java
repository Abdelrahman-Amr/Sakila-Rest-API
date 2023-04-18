package gov.iti.jets.controller;

import gov.iti.jets.entity.Actor;
import gov.iti.jets.persistence.repositoryImpl.ActorRepositoryImpl;
import gov.iti.jets.service.ActorService;
import gov.iti.jets.dto.ActorDto;
import gov.iti.jets.service.FilmService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("actors")
public class ActorController extends BaseControllerImpl<Actor, ActorDto, Integer>{

    private ActorService actorService;

    public ActorController()
    {
        actorService = ActorService.getInstance();
        baseService = actorService;
    }

    @GET
    @Path("/filter")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response findByName(@QueryParam("name") String name)
    {
        List<ActorDto> actorDtos = actorService.findByName(name);
        return  Response.accepted().entity(actorDtos).build();

    }
}
