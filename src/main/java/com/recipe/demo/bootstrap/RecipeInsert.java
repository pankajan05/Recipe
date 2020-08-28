package com.recipe.demo.bootstrap;

import com.recipe.demo.model.Recipe;
import com.recipe.demo.repository.RecipeRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RecipeInsert implements CommandLineRunner {
    private final RecipeRepo recipeRepo;

    public RecipeInsert(RecipeRepo recipeRepo) {
        this.recipeRepo = recipeRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        Recipe recipe1 = new Recipe("R001", "Cookie","https://images-gmi-pmc.edge-generalmills.com/087d17eb-500e-4b26-abd1-4f9ffa96a2c6.jpg","Cookie making is easy. We can make cookie from sugar");
        recipeRepo.save(recipe1);
    }
}
