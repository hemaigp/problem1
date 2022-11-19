package com.problem.demo.repository;

import com.problem.demo.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface CategoryRepository extends CrudRepository<Category,Integer> {


}
