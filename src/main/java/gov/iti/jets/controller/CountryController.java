package gov.iti.jets.controller;

import gov.iti.jets.dto.CategoryDto;
import gov.iti.jets.dto.CountryDto;
import gov.iti.jets.entity.Category;
import gov.iti.jets.entity.Country;
import gov.iti.jets.service.CategoryService;
import gov.iti.jets.service.CountryService;
import jakarta.ws.rs.Path;


@Path("countries")
public class CountryController extends BaseControllerImpl<Country, CountryDto, Short> {
    private CountryService countryService;

    public CountryController()
    {

        countryService = CountryService.getInstance();
        baseService = countryService;
    }
}
