package com.recipe.demo.service;

import com.recipe.demo.model.Recipe;
import com.recipe.demo.repository.RecipeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {
    @Autowired
    private RecipeRepo recipeRepo;

    public List<Recipe> listAll() {
        return recipeRepo.findAll();
    }

    public void save(Recipe recipe) {
        recipeRepo.save(recipe);
    }

    public Recipe get(String id){
        return recipeRepo.findById(id).get();
    }

    public void delete(String id) {
        recipeRepo.deleteById(id);
    }
}
