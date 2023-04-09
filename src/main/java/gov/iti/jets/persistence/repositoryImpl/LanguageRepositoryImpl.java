package gov.iti.jets.persistence.repositoryImpl;

import gov.iti.jets.entity.Film;
import gov.iti.jets.entity.FilmActor;
import gov.iti.jets.entity.Language;
import gov.iti.jets.persistence.repository.FilmRepository;
import gov.iti.jets.persistence.repository.LanguageRepository;
import gov.iti.jets.util.MyLocal;
import jakarta.persistence.Query;

import java.util.List;

public class LanguageRepositoryImpl extends BaseRepositoryImpl<Language, Short> implements LanguageRepository {

    public LanguageRepositoryImpl()
    {
        super(Language.class, MyLocal.getInstance().get());
    }

}
