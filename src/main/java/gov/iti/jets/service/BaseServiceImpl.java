package gov.iti.jets.service;

import gov.iti.jets.dto.BaseDto;
import gov.iti.jets.entity.BaseEntity;
import gov.iti.jets.mapper.BaseMapper;
import gov.iti.jets.persistence.repositoryImpl.BaseRepositoryImpl;
import gov.iti.jets.util.MyLocal;
import org.mapstruct.factory.Mappers;

import java.time.LocalDateTime;
import java.util.List;

public abstract  class BaseServiceImpl<E extends BaseEntity, D extends BaseDto, T>  implements BaseService<E,D,T > {
    private Class<?> entityClass;
    private Class<?> mapperClass;
    protected BaseMapper<E, D> baseMapper;
    public BaseServiceImpl(Class<?> entityClass, Class<?> mapperClass)
    {
        this.entityClass = entityClass;
        this.mapperClass = mapperClass;
        baseMapper = (BaseMapper<E, D>) Mappers.getMapper(mapperClass);
    }
    @Override
    public D findById(T id) {
        BaseRepositoryImpl<E,T> baseRepository = new BaseRepositoryImpl<>(entityClass, MyLocal.getInstance().get());
        E entity =  baseRepository.findById( id);
        return baseMapper.toDto(entity);
    }

    @Override
    public List<D> findAll() {
        BaseRepositoryImpl<E,T> baseRepository = new BaseRepositoryImpl<>(entityClass, MyLocal.getInstance().get());
        List<E> entities = baseRepository.findAll();
        return  baseMapper.toDTOs(entities);
    }
    @Override
    public List<D> getPage(int page, int limit)
    {
        BaseRepositoryImpl<E,T> baseRepository = new BaseRepositoryImpl<>(entityClass, MyLocal.getInstance().get());
        List<E> entities = baseRepository.getPage(page, limit);
        return  baseMapper.toDTOs(entities);
    }


    @Override
    public D add(D dto) {
        BaseRepositoryImpl<E,T> baseRepository = new BaseRepositoryImpl<>(entityClass, MyLocal.getInstance().get());
        dto.setLastUpdate(LocalDateTime.now());
        E savedEntity = baseRepository.add(baseMapper.toEntity(dto));
        return  baseMapper.toDto(savedEntity);
    }

    @Override
    public D update(T id, D dto) {
        BaseRepositoryImpl<E,T> baseRepository = new BaseRepositoryImpl<>(entityClass, MyLocal.getInstance().get());
        dto.setLastUpdate(LocalDateTime.now());
        E entity = baseRepository.findById(id);
         entity = baseMapper.partialUpdate(dto,entity);
        System.out.println(entity);
        E  updatedEntity = baseRepository.update(entity);
        return baseMapper.toDto(updatedEntity);
    }

    @Override
    public D deleteById(T id)
    {
        BaseRepositoryImpl<E,T> baseRepository = new BaseRepositoryImpl<>(entityClass, MyLocal.getInstance().get());
        E entity = baseRepository.deleteById(id);
        return baseMapper.toDto(entity);
    }
}
