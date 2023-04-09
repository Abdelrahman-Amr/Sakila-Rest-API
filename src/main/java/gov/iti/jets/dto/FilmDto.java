package gov.iti.jets.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * A DTO for the {@link gov.iti.jets.entity.Film} entity
 */
@Data
@NoArgsConstructor
public class FilmDto implements BaseDto {
    private  Short filmId;
    private  String title;
    private  String description;
    private LocalDate releaseYear;
    private  Short rentalDuration;
    private  BigDecimal rentalRate;
    private  Short length;
    private  BigDecimal replacementCost;
    private  String rating;
    private  String specialFeatures;
    private LocalDateTime lastUpdate;
}
