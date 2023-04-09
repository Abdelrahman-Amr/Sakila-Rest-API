package gov.iti.jets.service;

import gov.iti.jets.dto.ActorDto;
import gov.iti.jets.dto.CategoryDto;
import gov.iti.jets.entity.Actor;
import gov.iti.jets.entity.Category;
import gov.iti.jets.entity.Film;
import gov.iti.jets.mapper.CategoryMapper;
import gov.iti.jets.mapper.FilmMapper;

public class CategoryService extends BaseServiceImpl<Category, CategoryDto, Short>{
    private static  volatile CategoryService categoryService;

    private CategoryService()
    {
        super(Category.class, CategoryMapper.class);
    }
    public static CategoryService getInstance()
    {
        if(categoryService == null)
        {
            synchronized (CategoryService.class)
            {
                if(categoryService == null)
                {
                    categoryService = new CategoryService();
                }
            }
        }
        return  categoryService;
    }
}
