package br.com.rovidasoft.financasapi.controllers;

import br.com.rovidasoft.financasapi.entities.Category;
import br.com.rovidasoft.financasapi.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
@RequestMapping(value = "/category")
public class CategoryController {

    CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        return ResponseEntity.ok().body(categoryService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(categoryService.findById(id));
    }

    @PostMapping("/add")
    public ResponseEntity<Category> add(Category category) {
        return ResponseEntity.ok().body(categoryService.add(category));
    }

}
