package gov.iti.jets.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * A DTO for the {@link gov.iti.jets.entity.Actor} entity
 */
@Data
@NoArgsConstructor
public class ActorDto implements BaseDto {
    private  Integer actorId;
    private  String firstName;
    private  String lastName;
    private LocalDateTime lastUpdate;
}
