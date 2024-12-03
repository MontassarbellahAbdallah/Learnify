package com.learnify.dev.restController;

import com.learnify.dev.entity.Category;
import com.learnify.dev.repository.CategoryRepository;
import com.learnify.dev.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/Category")
public class CategoryRestController {
    @Autowired
    CategoryService categoryService;
    @Autowired
    CategoryRepository categoryRepository;

    @RequestMapping(method = RequestMethod.POST)
    public Category ajoutCategory(@RequestBody Category category){
        Category saveUser= categoryRepository.save(category);
        return categoryService.ajouterCategory(category);
    }
    @RequestMapping(method = RequestMethod.PUT,value ="/{id}")
    public Category modifierCategory(@RequestBody Category category, @PathVariable("id")Long id){
        Category savecategory= categoryRepository.save(category);
        return categoryService.modifierCategory(category);
    }
    @RequestMapping(method = RequestMethod.GET)
    public List<Category> afficherCategory(){
        return categoryService.afficherCategory();
    }
    @RequestMapping(method = RequestMethod.GET,value = "/{id}")
    public Optional<Category> afficherCategoryById(@PathVariable("id")Long id){
        return categoryService.affchierCategoryById(id);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/{id}")
    public void supprimerCategory(@PathVariable("id")Long id){
        categoryService.supprimerCategory(id);
    }
}
