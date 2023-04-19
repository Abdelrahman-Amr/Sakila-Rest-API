package gov.iti.jets.persistence.repository;

import gov.iti.jets.entity.Staff;

import java.util.List;

public interface StaffRepository extends BaseRepository<Staff, Short>{

    byte[] getStaffPicture(short id);

    public List<Staff> findByName(String name);

    public boolean updateStaffPicture(short id, byte[] picture);


}


