package gov.iti.jets.controller;

import gov.iti.jets.dto.FilmDto;
import gov.iti.jets.entity.Film;
import gov.iti.jets.service.FilmService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("films")

public class FilmController extends BaseControllerImpl<Film,FilmDto, Short> {
    private FilmService filmService;

    public FilmController()
    {

        filmService = FilmService.getInstance();
        baseService = filmService;
    }
    @GET
    @Path("/filter")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response findFilmsByActorId(@DefaultValue("1") @QueryParam("actorId") Integer actorId)
    {
        List<FilmDto> filmDtos = filmService.findFilmsByActorId(actorId);
        return  Response.accepted().entity(filmDtos).build();
    }

}
