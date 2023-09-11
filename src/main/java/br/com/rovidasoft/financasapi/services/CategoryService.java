package br.com.rovidasoft.financasapi.services;

import br.com.rovidasoft.financasapi.entities.Category;
import br.com.rovidasoft.financasapi.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> category = categoryRepository.findById(id);
        return category.get();
    }


    public Category add(Category category){
        return categoryRepository.save(category);
    }
}
