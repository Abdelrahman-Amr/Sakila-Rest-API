package gov.iti.jets.mapper;

import gov.iti.jets.dto.CityDto;
import gov.iti.jets.dto.CountryDto;
import gov.iti.jets.entity.City;
import gov.iti.jets.entity.Country;
import org.mapstruct.*;
import org.mapstruct.Mapper;

import javax.enterprise.context.ApplicationScoped;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)
public interface CountryMapper extends BaseMapper<Country, CountryDto> {


}
