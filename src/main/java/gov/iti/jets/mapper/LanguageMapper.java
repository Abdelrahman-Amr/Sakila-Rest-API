package gov.iti.jets.mapper;

import gov.iti.jets.dto.LanguageDto;
import gov.iti.jets.entity.Language;
import org.mapstruct.*;
import org.mapstruct.Mapper;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)
public interface LanguageMapper  extends BaseMapper<Language, LanguageDto>{

}
