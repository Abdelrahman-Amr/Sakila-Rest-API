package gov.iti.jets.mapper;

import gov.iti.jets.dto.StoreDto;
import gov.iti.jets.entity.Store;
import org.mapstruct.*;
import org.mapstruct.Mapper;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)
public interface StoreMapper extends BaseMapper<Store, StoreDto>{

}
