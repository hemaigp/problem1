package com.problem.demo.controller;

import com.problem.demo.model.Category;
import com.problem.demo.model.CategoryRelations;
import com.problem.demo.repository.CategoryRepository;
import com.problem.demo.repository.categoryRelations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {

    @Autowired
    private CategoryRepository repository;
    @Autowired
    private categoryRelations relations;

    @GetMapping("/home")
    public String home() {
        return "Welcome To DeccanLogic...  ";
    }

    @GetMapping("/Category")
    public List<Category> getAllCategories()
    {
        List<Category> categoryList = new ArrayList<>();
        repository.findAll().forEach(categoryList::add);
        return categoryList;
    }
    @PostMapping("/insertCategory")
    public Category addCategory(@RequestBody Category category) {
        Category addCategory = repository.save(category);

        return addCategory;
    }
    @PutMapping("/catUpdate/{id}")
    public Category updateCategory(@PathVariable  ("id") int id, @RequestBody Category category){
      Category update =  repository.save(category);
      return update;
    }
    @DeleteMapping("/catDelete/{id}")
    public void deleteCategory(@PathVariable int id){
        repository.deleteById(id);
    }

//CategoryRelations //////////////////////////////////////////
    @GetMapping("/categoryRelations")
    public List<CategoryRelations> getAllRelations()
    {
        List<CategoryRelations> categoryRelationsList = new ArrayList<>();
        relations.findAll().forEach(categoryRelationsList::add);
        return categoryRelationsList;
    }
    @PostMapping("/insertCategoryRelations")
    public CategoryRelations addCategoryRelations(@RequestBody CategoryRelations Relation) {
        CategoryRelations relation = relations.save(Relation);

        return relation;
    }
    @PutMapping("/categoryRelations/Update/{category1}")
    public CategoryRelations updateCategory(@PathVariable  ("category1") int category1, @RequestBody CategoryRelations relation){
        CategoryRelations update =  relations.save(relation);
        return update;
    }
    @DeleteMapping("/relationDelete/{category1}")
    public void deleteCatRelation(@PathVariable int category1){
        relations.deleteById(category1);
    }

}
