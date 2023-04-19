package gov.iti.jets.persistence.repository;

import gov.iti.jets.entity.City;
import gov.iti.jets.entity.Film;

import java.util.List;

public interface CityRepository extends BaseRepository<City, Short> {

    List<City> findCitiesByCountryId(Short countryId);

}
