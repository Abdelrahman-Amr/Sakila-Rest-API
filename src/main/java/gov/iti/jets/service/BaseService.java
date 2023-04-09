package gov.iti.jets.service;

import gov.iti.jets.dto.BaseDto;
import gov.iti.jets.dto.FilmDto;
import gov.iti.jets.entity.BaseEntity;
import gov.iti.jets.entity.Film;
import gov.iti.jets.persistence.repositoryImpl.BaseRepositoryImpl;
import gov.iti.jets.persistence.repositoryImpl.FilmRepositoryImpl;

import java.util.List;

public interface BaseService<E extends BaseEntity, D extends BaseDto, T> {

    public D findById(T id);
    public List<D> findAll();
    public D add(D dto) ;
    public D update(T id, D dto) ;

    }
