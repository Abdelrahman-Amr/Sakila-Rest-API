package gov.iti.jets.controller;

import gov.iti.jets.dto.CategoryDto;
import gov.iti.jets.entity.Category;
import gov.iti.jets.service.CategoryService;
import jakarta.ws.rs.*;


@Path("categories")
public class CategoryController extends BaseControllerImpl<Category, CategoryDto, Short> {
    private CategoryService categoryService;

    public CategoryController()
    {

        categoryService = CategoryService.getInstance();
        baseService = categoryService;
    }
}
