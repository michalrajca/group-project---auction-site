package pl.sda.auctionsite.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.sda.auctionsite.model.services.CategoryService;

@Controller
@ControllerAdvice(basePackages = {"pl.sda.auctionsite.web.controllers"} )
@RequestMapping(value = "/home")
public class HomePageController {

    @Autowired
    private  CategoryService categoryService;

    @GetMapping
    public String homePage(){
        return "homePage";
    }

    @ModelAttribute
    public void categoryAtt (Model model) {
        model.addAttribute("categories", categoryService.findAllCategories());
    }


}
