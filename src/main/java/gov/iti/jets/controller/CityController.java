package gov.iti.jets.controller;

import gov.iti.jets.dto.CityDto;
import gov.iti.jets.dto.CountryDto;
import gov.iti.jets.entity.City;
import gov.iti.jets.entity.Country;
import gov.iti.jets.service.CityService;
import gov.iti.jets.service.CountryService;
import jakarta.ws.rs.Path;


@Path("cities")
public class CityController extends BaseControllerImpl<City, CityDto, Short> {
    private CityService cityService;

    public CityController()
    {

        cityService = CityService.getInstance();
        baseService = cityService;
    }
}
