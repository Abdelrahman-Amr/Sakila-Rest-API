package gov.iti.jets.service;

import gov.iti.jets.dto.CityDto;
import gov.iti.jets.dto.CountryDto;
import gov.iti.jets.dto.FilmDto;
import gov.iti.jets.entity.City;
import gov.iti.jets.entity.Country;
import gov.iti.jets.entity.Film;
import gov.iti.jets.mapper.CityMapper;
import gov.iti.jets.mapper.CountryMapper;
import gov.iti.jets.persistence.repositoryImpl.CityRepositoryImpl;
import gov.iti.jets.persistence.repositoryImpl.FilmRepositoryImpl;

import java.util.List;

public class CityService extends BaseServiceImpl<City, CityDto, Short>{
    private static  volatile CityService cityService;

    private CityService()
    {
        super(City.class, CityMapper.class);
    }
    public static CityService getInstance()
    {
        if(cityService == null)
        {
            synchronized (CityService.class)
            {
                if(cityService == null)
                {
                    cityService = new CityService();
                }
            }
        }
        return cityService;
    }

    public List<CityDto> findCitiesByCountryId(Short countryId)
    {
        CityRepositoryImpl cityRepository = new CityRepositoryImpl();
        List<City> cities = cityRepository.findCitiesByCountryId(countryId);
        return  baseMapper.toDTOs(cities);
    }
}
