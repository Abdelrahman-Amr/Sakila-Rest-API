package gov.iti.jets.mapper;

import gov.iti.jets.entity.FilmActorPK;
import org.mapstruct.*;
import org.mapstruct.Mapper;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)
public interface FilmActorPKMapper {

}
