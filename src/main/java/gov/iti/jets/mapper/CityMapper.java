package gov.iti.jets.mapper;

import gov.iti.jets.dto.CategoryDto;
import gov.iti.jets.dto.CityDto;
import gov.iti.jets.entity.Category;
import gov.iti.jets.entity.City;
import gov.iti.jets.entity.Country;
import org.mapstruct.*;
import org.mapstruct.Mapper;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)
public interface CityMapper extends BaseMapper<City, CityDto> {

//    default City partialUpdate(CityDto dto, City entity) {
//        if (dto == null) {
//            return entity;
//        }
//
//        if (dto.getCityId() != null) {
//            entity.setCityId(dto.getCityId());
//        }
//        if (dto.getCity() != null) {
//            entity.setCity(dto.getCity());
//        }
//        if (dto.getLastUpdate() != null) {
//            entity.setLastUpdate(dto.getLastUpdate());
//        }
//        if (dto.getCountryId() != null) {
//
//            Country country = new Country();
//            country.setCountryId(dto.getCountryId().getCountryId());
//            country.setCountry(dto.getCountryId().getCountry());
//            country.setLastUpdate(dto.getCountryId().getLastUpdate());
//            entity.setCountryId(country);
//
////                countryDtoToCountry1( dto.getCountryId(), entity.getCountryId() );
////            }
//        }
//        return entity;
//
//
//    }
}
