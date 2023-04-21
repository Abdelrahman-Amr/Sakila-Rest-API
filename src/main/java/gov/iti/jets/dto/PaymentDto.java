package gov.iti.jets.dto;

import gov.iti.jets.dto.miniDto.MiniCustomerDto;
import gov.iti.jets.dto.miniDto.MiniRentalDto;
import gov.iti.jets.dto.miniDto.MiniStaffDto;
import gov.iti.jets.entity.Customer;
import gov.iti.jets.entity.Rental;
import gov.iti.jets.entity.Staff;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * A DTO for the {@link gov.iti.jets.entity.Payment} entity
 */
@Data
@NoArgsConstructor
@XmlRootElement

public class PaymentDto extends BaseDto {
    private  Short paymentId;
    private  BigDecimal amount;
    private LocalDateTime paymentDate;
    private MiniCustomerDto customerId;
    private MiniRentalDto rentalId;
    private MiniStaffDto staffId;
}
