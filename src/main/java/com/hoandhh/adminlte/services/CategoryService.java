package com.hoandhh.adminlte.services;

import com.hoandhh.adminlte.models.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAll();

    Boolean create(Category category);

    Category findById(Integer id);

    Boolean update(Category category);

    Boolean delete(Integer id);

    List<Category> searchCategory(String keyword);
}
