package gov.iti.jets.mapper;

import gov.iti.jets.dto.StaffDto;
import gov.iti.jets.entity.Staff;
import org.mapstruct.*;
import org.mapstruct.Mapper;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)
public interface StaffMapper  extends BaseMapper<Staff, StaffDto>{



}
