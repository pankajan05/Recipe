package com.recipe.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecipeController {
    @RequestMapping("/")
    public String recipe(){
        return "Recipe";
    }
}
