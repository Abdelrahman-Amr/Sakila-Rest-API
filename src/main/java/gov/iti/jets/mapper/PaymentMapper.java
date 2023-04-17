package gov.iti.jets.mapper;

import gov.iti.jets.dto.BaseDto;
import gov.iti.jets.dto.PaymentDto;
import gov.iti.jets.entity.Customer;
import gov.iti.jets.entity.Payment;
import gov.iti.jets.entity.Rental;
import gov.iti.jets.entity.Staff;
import org.mapstruct.*;
import org.mapstruct.Mapper;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)
public interface PaymentMapper extends BaseMapper<Payment, PaymentDto> {

}
