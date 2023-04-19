package gov.iti.jets.persistence.repositoryImpl;

import gov.iti.jets.entity.BaseEntity;
import gov.iti.jets.entity.City;
import gov.iti.jets.entity.Country;
import gov.iti.jets.persistence.repository.BaseRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class BaseRepositoryImpl<E extends BaseEntity, T> implements BaseRepository<E  , T> {

    protected EntityManager entityManager;
    private Class<?> entityClass;
    public BaseRepositoryImpl(Class<?> entityClass, EntityManager entityManager)
    {
        this.entityClass = entityClass;
        this.entityManager = entityManager;
    }

    @Override
    public E findById( T id) {
        E e = (E) entityManager.find(entityClass, id);
        return e;
    }

    @Override
    public List<E> findAll() {
            Query query = entityManager.createQuery("from "+entityClass.getName(),entityClass);
            List<E> entities = query.getResultList();
            return entities;
    }

    @Override
    public List<E> getPage(int page, int limit) {

        Query query = entityManager.createQuery("from "+entityClass.getName(),entityClass).setFirstResult((page-1)*limit).setMaxResults(limit);
        List<E> entities = query.getResultList();
        return entities;
    }
    @Override
    public E add(E entity) {
        try{
            entityManager.getTransaction().begin();
            entityManager.persist(entity);
        }catch (Exception ex)
        {
            entity = null;
            ex.printStackTrace();
        }
        finally {
            entityManager.getTransaction().commit();
        }
       return entity;
    }

    @Override
    public E update(E entity) {
        try{
            entityManager.getTransaction().begin();

           entity =  entityManager.merge(entity);
        }catch (Exception ex)
        {
            entity = null;
            ex.printStackTrace();
        }
        finally {
            entityManager.getTransaction().commit();
        }
        entityManager.refresh(entity);
        return entity;
    }

    @Override
    public E deleteById(T id)
    {
        E deletedEntity = null;
        try{
            entityManager.getTransaction().begin();
            deletedEntity= (E) entityManager.find(entityClass,id);
            entityManager.remove(deletedEntity);
        }catch (Exception ex)
        {
            deletedEntity = null;
            ex.printStackTrace();
        }
        finally {
            entityManager.getTransaction().commit();
        }
        return deletedEntity;
    }


}
