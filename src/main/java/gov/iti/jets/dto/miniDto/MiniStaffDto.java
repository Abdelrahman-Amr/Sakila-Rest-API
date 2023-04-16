package gov.iti.jets.dto.miniDto;

import gov.iti.jets.dto.AddressDto;
import gov.iti.jets.dto.BaseDto;
import gov.iti.jets.dto.StoreDto;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Base64;

@Data
@NoArgsConstructor
public class MiniStaffDto extends BaseDto {
    private  Short staffId;
    private  String firstName;
    private  String lastName;
    private  String email;
    private  String username;
    private  String password;
}
