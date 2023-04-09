package gov.iti.jets.mapper;

import gov.iti.jets.dto.ActorDto;
import gov.iti.jets.dto.BaseDto;
import gov.iti.jets.entity.Actor;
import gov.iti.jets.entity.BaseEntity;
import gov.iti.jets.entity.Film;
import gov.iti.jets.dto.FilmDto;
import org.mapstruct.*;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.Collection;

import static java.util.stream.Collectors.toCollection;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)
public interface FilmMapper extends BaseMapper<Film , FilmDto>{

}
