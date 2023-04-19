package gov.iti.jets.mapper;

import gov.iti.jets.dto.FilmCategoryDto;
import gov.iti.jets.entity.FilmCategory;
import org.mapstruct.*;
import org.mapstruct.Mapper;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI, uses = {FilmCategoryPKMapper.class})
public interface FilmCategoryMapper {

}
