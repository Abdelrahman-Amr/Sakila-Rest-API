package gov.iti.jets.dto;

import jakarta.xml.bind.annotation.XmlRootElement;
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
@XmlRootElement

public class LanguageDto extends BaseDto{
    private  Short languageId;
    private  String name;
//    private LocalDateTime lastUpdate;


}
