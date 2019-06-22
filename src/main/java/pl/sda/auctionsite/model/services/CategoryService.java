package pl.sda.auctionsite.model.services;

import org.springframework.stereotype.Component;
import pl.sda.auctionsite.model.entity.Category;
import pl.sda.auctionsite.model.repositories.CategoryRepository;

import java.util.List;

@Component
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> findAllCategories (){
        return categoryRepository.findAll();
    }

}
