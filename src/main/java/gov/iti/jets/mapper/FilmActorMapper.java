package gov.iti.jets.mapper;

import gov.iti.jets.dto.FilmActorDto;
import gov.iti.jets.entity.FilmActor;
import org.mapstruct.*;
import org.mapstruct.Mapper;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI, uses = {FilmActorPKMapper.class})
public interface FilmActorMapper {

}
