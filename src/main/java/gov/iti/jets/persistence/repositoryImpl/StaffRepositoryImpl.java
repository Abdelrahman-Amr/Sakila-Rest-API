package gov.iti.jets.persistence.repositoryImpl;

import gov.iti.jets.dto.StaffDto;
import gov.iti.jets.entity.Actor;
import gov.iti.jets.entity.City;
import gov.iti.jets.entity.Customer;
import gov.iti.jets.entity.Staff;
import gov.iti.jets.persistence.repository.StaffRepository;
import gov.iti.jets.util.MyLocal;
import jakarta.persistence.Query;

import java.util.List;

public class StaffRepositoryImpl  extends  BaseRepositoryImpl<Staff, Short> implements StaffRepository {

    public StaffRepositoryImpl()
    {
        super(Staff.class, MyLocal.getInstance().get());
    }

    @Override
    public byte[] getStaffPicture(short id)
    {
        Query query = entityManager.createQuery("select s.picture from Staff s where s.id = :id");
        query.setParameter("id", id);
        List<byte[]> list = query.getResultList();
        return list.get(0);
    }

    @Override
    public List<Staff> findByName(String name)
    {
        Query query = entityManager.createQuery("from Staff a where a.firstName ilike '%' || :name || '%' or a.lastName ilike '%' || :name || '%'   ", Actor.class);
        query.setParameter("name", name);
        List<Staff> staff = query.getResultList();
        return staff;
    }

}


