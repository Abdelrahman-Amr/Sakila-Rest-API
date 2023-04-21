package gov.iti.jets.dto;

import gov.iti.jets.dto.miniDto.MiniStoreDto;
import gov.iti.jets.entity.Address;
import gov.iti.jets.entity.Store;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * A DTO for the {@link gov.iti.jets.entity.Customer} entity
 */
@Data
@NoArgsConstructor
@XmlRootElement

public class CustomerDto extends BaseDto {
    private  Short customerId;
    private  String firstName;
    private  String lastName;
    private  String email;
    private  boolean active;
    private LocalDateTime createDate;
    private AddressDto addressId;
    private MiniStoreDto storeId;
//    private  Date lastUpdate;
}
