package gov.iti.jets.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * A DTO for the {@link gov.iti.jets.entity.City} entity
 */
@Data
@NoArgsConstructor
public class CityDto implements BaseDto {
    private  Short cityId;
    private  String city;
    private CountryDto countryId;
    private  LocalDateTime lastUpdate;
}
