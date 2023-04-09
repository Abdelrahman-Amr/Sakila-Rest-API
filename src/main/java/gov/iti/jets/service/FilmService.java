package gov.iti.jets.service;

import gov.iti.jets.dto.FilmDto;
import gov.iti.jets.entity.Actor;
import gov.iti.jets.entity.Film;
import gov.iti.jets.mapper.ActorMapper;
import gov.iti.jets.mapper.BaseMapper;
import gov.iti.jets.mapper.FilmMapper;
import gov.iti.jets.persistence.repositoryImpl.FilmRepositoryImpl;
import org.mapstruct.factory.Mappers;

import java.util.List;

public class FilmService extends  BaseServiceImpl<Film, FilmDto, Short>{
    private static  volatile FilmService filmService;

    private FilmService()
    {
        super(Film.class, FilmMapper.class);
    }
    public static FilmService getInstance()
    {
        if(filmService == null)
        {
            synchronized (FilmService.class)
            {
                if(filmService == null)
                {
                    filmService = new FilmService();
                }
            }
        }
        return  filmService;
    }

    public List<FilmDto> findFilmsByActorId(Integer actorId)
    {
        FilmRepositoryImpl filmRepository = new FilmRepositoryImpl();
        List<Film> films = filmRepository.findFilmsByActorId(actorId);
        return  baseMapper.toDTOs(films);
    }
}
