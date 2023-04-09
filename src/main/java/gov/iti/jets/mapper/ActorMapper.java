package gov.iti.jets.mapper;

import gov.iti.jets.dto.FilmDto;
import gov.iti.jets.entity.Actor;
import gov.iti.jets.dto.ActorDto;
import gov.iti.jets.entity.Film;
import org.mapstruct.*;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.Collection;

import static java.util.stream.Collectors.toCollection;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)
public interface ActorMapper extends BaseMapper<Actor, ActorDto> {

}
