package com.learnify.dev.service;

import com.learnify.dev.entity.Category;
import com.learnify.dev.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;
    @Override
    public Category ajouterCategory(Category category) {
        return categoryRepository.save(category);
    }
    @Override
    public Category modifierCategory(Category category) {
        return categoryRepository.save(category);
    }
    @Override
    public void supprimerCategory(Long id) {
        categoryRepository.deleteById(id);
    }
    @Override
    public List<Category> afficherCategory() {
        return categoryRepository.findAll();
    }
    @Override
    public Optional<Category> affchierCategoryById(Long id) {
        return categoryRepository.findById(id);
    }

}
