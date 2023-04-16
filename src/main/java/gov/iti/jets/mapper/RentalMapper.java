package gov.iti.jets.mapper;

import gov.iti.jets.dto.RentalDto;
import gov.iti.jets.entity.Rental;
import org.mapstruct.*;
import org.mapstruct.Mapper;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)
public interface RentalMapper extends BaseMapper<Rental, RentalDto> {

}
