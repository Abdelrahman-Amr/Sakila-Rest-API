package gov.iti.jets.mapper;

import gov.iti.jets.dto.InventoryDto;
import gov.iti.jets.entity.Inventory;
import org.mapstruct.*;
import org.mapstruct.Mapper;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)
public interface InventoryMapper  extends BaseMapper<Inventory, InventoryDto> {

}
