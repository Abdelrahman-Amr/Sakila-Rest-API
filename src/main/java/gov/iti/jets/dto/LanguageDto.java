package gov.iti.jets.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * A DTO for the {@link gov.iti.jets.entity.Language} entity
 */
@Data
@NoArgsConstructor
public class LanguageDto implements BaseDto{
    private  Short languageId;
    private  String name;
    private LocalDateTime lastUpdate;


}
