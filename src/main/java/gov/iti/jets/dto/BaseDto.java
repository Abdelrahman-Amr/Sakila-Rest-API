package gov.iti.jets.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class BaseDto implements Serializable {
    private LocalDateTime lastUpdate;
}
