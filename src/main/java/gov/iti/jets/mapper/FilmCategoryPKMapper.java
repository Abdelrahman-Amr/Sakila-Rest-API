package gov.iti.jets.mapper;

import gov.iti.jets.entity.FilmCategoryPK;
import org.mapstruct.*;
import org.mapstruct.Mapper;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)
public interface FilmCategoryPKMapper {

}
