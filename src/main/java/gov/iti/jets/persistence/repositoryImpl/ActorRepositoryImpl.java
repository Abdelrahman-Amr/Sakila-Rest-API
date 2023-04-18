package gov.iti.jets.persistence.repositoryImpl;

import gov.iti.jets.entity.Actor;
import gov.iti.jets.persistence.repository.ActorRepository;
import gov.iti.jets.persistence.repositoryImpl.BaseRepositoryImpl;
import gov.iti.jets.util.MyLocal;
import jakarta.persistence.Query;

import java.util.List;


public class ActorRepositoryImpl extends BaseRepositoryImpl<Actor, Integer> implements ActorRepository {
    public ActorRepositoryImpl()
    {
        super(Actor.class, MyLocal.getInstance().get());
    }

    @Override
    public List<Actor> findByName(String name)
    {
        Query query = entityManager.createQuery("from Actor a where a.firstName ilike '%' || :name || '%' or a.lastName ilike '%' || :name || '%'   ",Actor.class);
        query.setParameter("name", name);
        List<Actor> actors = query.getResultList();
        return actors;
    }

}
