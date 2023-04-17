package gov.iti.jets.mapper;

import gov.iti.jets.dto.ActorDto;
import gov.iti.jets.dto.BaseDto;
import gov.iti.jets.entity.Actor;
import gov.iti.jets.entity.BaseEntity;
import gov.iti.jets.entity.Film;
import gov.iti.jets.dto.FilmDto;
import gov.iti.jets.entity.Language;
import org.mapstruct.*;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.Collection;

import static java.util.stream.Collectors.toCollection;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)
public interface FilmMapper extends BaseMapper<Film , FilmDto>{

    default Film partialUpdate(FilmDto dto, Film entity) {
        if ( dto == null ) {
            return entity;
        }

        if ( dto.getFilmId() != null ) {
            entity.setFilmId( dto.getFilmId() );
        }
        if ( dto.getTitle() != null ) {
            entity.setTitle( dto.getTitle() );
        }
        if ( dto.getDescription() != null ) {
            entity.setDescription( dto.getDescription() );
        }
        if ( dto.getReleaseYear() != null ) {
            entity.setReleaseYear( dto.getReleaseYear() );
        }
        if ( dto.getRentalDuration() != null ) {
            entity.setRentalDuration( dto.getRentalDuration() );
        }
        if ( dto.getRentalRate() != null ) {
            entity.setRentalRate( dto.getRentalRate() );
        }
        if ( dto.getLength() != null ) {
            entity.setLength( dto.getLength() );
        }
        if ( dto.getReplacementCost() != null ) {
            entity.setReplacementCost( dto.getReplacementCost() );
        }
        if ( dto.getRating() != null ) {
            entity.setRating( dto.getRating() );
        }
        if ( dto.getSpecialFeatures() != null ) {
            entity.setSpecialFeatures( dto.getSpecialFeatures() );
        }
        if ( dto.getLastUpdate() != null ) {
            entity.setLastUpdate( dto.getLastUpdate() );
        }
        if ( dto.getLanguageId() != null ) {
            Language language = new Language();
            language.setLanguageId(dto.getLanguageId().getLanguageId());
            entity.setLanguageId(language);
        }

        return entity;
    }

}
