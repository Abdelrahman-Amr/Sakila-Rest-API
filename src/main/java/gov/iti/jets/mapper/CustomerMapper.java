package gov.iti.jets.mapper;

import gov.iti.jets.dto.CustomerDto;
import gov.iti.jets.entity.Customer;
import org.mapstruct.*;
import org.mapstruct.Mapper;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)
public interface CustomerMapper extends BaseMapper<Customer, CustomerDto>{

}
