package pl.sda.auctionsite.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import pl.sda.auctionsite.model.entity.User;
import pl.sda.auctionsite.model.services.SecurityService;
import pl.sda.auctionsite.model.services.UserService;
import pl.sda.auctionsite.model.services.UserValidator;

import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;

    @GetMapping("/user")
    public String user() {
        return "userPage";
    }

    @GetMapping("/registration")
    public String registration(Model model) {
        model.addAttribute("userForm", new User());
        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(@ModelAttribute("userForm") @Valid User userForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "registration";
        }
        userService.addUser(userForm);
        securityService.autoLogin(userForm.getLogin(),userForm.getPasswordConfirm());
        return "redirect:/user";
    }

    @PutMapping("/user/modify/{login}")
    public String modifyUser(@RequestBody User user, @PathVariable String login) {
        userService.modifyUser(user, login);
        return "userPage";
    }

    @DeleteMapping("/user/delete/{login}")
    public String deleteUser(@PathVariable String login) {
        userService.deleteUser(login);
        return "homePage";
    }

    @GetMapping("/login")
    public String login(Model model, String error, String logout) {
        if(error != null) model.addAttribute("error", "Username or password invalid");
        if (logout != null) model.addAttribute("message", "You have logged out successfully.");
        return "login";
    }

}