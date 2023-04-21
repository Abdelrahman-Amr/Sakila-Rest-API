package gov.iti.jets.dto;

import gov.iti.jets.dto.miniDto.MiniCustomerDto;
import gov.iti.jets.dto.miniDto.MiniStaffDto;
import gov.iti.jets.entity.Customer;
import gov.iti.jets.entity.Inventory;
import gov.iti.jets.entity.Staff;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * A DTO for the {@link gov.iti.jets.entity.Rental} entity
 */
@Data
@NoArgsConstructor
@XmlRootElement

public class RentalDto extends BaseDto {
    private  Integer rentalId;
    private  LocalDateTime rentalDate;
    private  LocalDateTime returnDate;
    private MiniCustomerDto customerId;
    private  InventoryDto inventoryId;
    private MiniStaffDto staffId;

}
