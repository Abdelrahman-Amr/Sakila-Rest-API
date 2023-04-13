package gov.iti.jets.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * A DTO for the {@link gov.iti.jets.entity.Staff} entity
 */
@Data
@NoArgsConstructor
public class StaffDto implements BaseDto {
    private Short staffId;
    private  String firstName;
    private  String lastName;
    private  byte[] picture;
    private  String email;
    private  boolean active;
    private  String username;
    private  String password;
    private LocalDateTime lastUpdate;
    private AddressDto addressId;
//    private Short storeid;
    private StoreDto storeId;
}
