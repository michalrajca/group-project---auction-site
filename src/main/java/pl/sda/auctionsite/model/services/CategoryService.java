package pl.sda.auctionsite.model.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.sda.auctionsite.model.entity.Category;
import pl.sda.auctionsite.model.repositories.CategoryRepository;

import java.util.List;

@Component
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;


    public List<Category> findAllCategories (){
        return categoryRepository.findAll();
    }

}
