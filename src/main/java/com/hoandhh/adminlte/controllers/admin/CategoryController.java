package com.hoandhh.adminlte.controllers.admin;

import com.hoandhh.adminlte.models.Category;
import com.hoandhh.adminlte.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/category")
    public String category(Model model) {
        List<Category> list = this.categoryService.getAll();
        model.addAttribute("list", list);
        return "admin/category/index";
    }

    @GetMapping("/add-category")
    public String addCategory(Model model) {

        Category category = new Category();
        category.setCategoryStatus(true);
        model.addAttribute("category", category);
        return "admin/category/add";
    }

    @PostMapping("/add-category")
    public String save(@ModelAttribute("category") Category category){
        if (this.categoryService.create(category)){
            return "redirect:/admin/category";
        }
            return "admin/category/add";
    }

    @GetMapping("/edit-category/{id}")
    public String edit(Model model) {
        return "admin/category/edit";
    }
}
