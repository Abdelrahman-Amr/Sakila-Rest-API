package gov.iti.jets.controller;

import gov.iti.jets.dto.CityDto;
import gov.iti.jets.dto.CountryDto;
import gov.iti.jets.dto.FilmDto;
import gov.iti.jets.entity.City;
import gov.iti.jets.entity.Country;
import gov.iti.jets.service.CityService;
import gov.iti.jets.service.CountryService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;


@Path("cities")
public class CityController extends BaseControllerImpl<City, CityDto, Short> {
    private CityService cityService;

    public CityController()
    {

        cityService = CityService.getInstance();
        baseService = cityService;
    }

    @GET
    @Path("/filter")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response findCitiesByCountryId(@DefaultValue("1") @QueryParam("countryId") Short countryId)
    {
        List<CityDto> cityDtos = cityService.findCitiesByCountryId(countryId);
        return  Response.accepted().entity(cityDtos).build();
    }
}
