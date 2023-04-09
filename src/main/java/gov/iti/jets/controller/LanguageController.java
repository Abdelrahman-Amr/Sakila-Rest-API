package gov.iti.jets.controller;

import gov.iti.jets.dto.LanguageDto;
import gov.iti.jets.entity.Language;
import gov.iti.jets.service.LanguageService;
import jakarta.ws.rs.Path;


@Path("languages")
public class LanguageController extends BaseControllerImpl<Language, LanguageDto, Short> {

    private LanguageService languageService;

    public LanguageController()
    {

        languageService = LanguageService.getInstance();
        baseService = languageService;
    }

}
