package com.recipe.demo.controller;

import com.recipe.demo.model.Recipe;
import com.recipe.demo.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class RecipeController {
    @Autowired
    private RecipeService service;

    @RequestMapping("/")
    public String recipe(Model model){
        List<Recipe> listRecipe = service.listAll();
        model.addAttribute("listRecipe", listRecipe);
        return "Recipe";
    }

    @RequestMapping("/new")
    public String addrecipe(Model model) {
        Recipe recipe = new Recipe();
        model.addAttribute("recipe", recipe);
        return "add_recipe";
    }
}
