package gov.iti.jets.dto;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * A DTO for the {@link gov.iti.jets.entity.Store} entity
 */
@Data
@NoArgsConstructor
@XmlRootElement

public class StoreDto extends BaseDto{
    private  Short storeId;
//    private  LocalDateTime lastUpdate;
    private AddressDto addressId;
    private ManagerDto managerStaffId;



}
