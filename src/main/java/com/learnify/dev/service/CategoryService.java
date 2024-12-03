package com.learnify.dev.service;

import com.learnify.dev.entity.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    Category ajouterCategory(Category category);
    Category modifierCategory(Category category);
    void supprimerCategory(Long id);
    List<Category> afficherCategory();
    Optional<Category> affchierCategoryById(Long id);
}
