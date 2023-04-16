package gov.iti.jets.dto.miniDto;

import gov.iti.jets.dto.BaseDto;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.Year;

@Data
@NoArgsConstructor
public class MiniFilmDto extends BaseDto {
    private  Short filmId;
    private  String title;
    private  String description;
    private Integer releaseYear;
}
