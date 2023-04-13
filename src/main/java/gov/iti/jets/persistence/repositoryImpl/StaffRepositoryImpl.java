package gov.iti.jets.persistence.repositoryImpl;

import gov.iti.jets.dto.StaffDto;
import gov.iti.jets.entity.City;
import gov.iti.jets.entity.Staff;
import gov.iti.jets.persistence.repository.StaffRepository;
import gov.iti.jets.util.MyLocal;

public class StaffRepositoryImpl  extends  BaseRepositoryImpl<Staff, Short> implements StaffRepository {

    public StaffRepositoryImpl()
    {
        super(Staff.class, MyLocal.getInstance().get());
    }

}
