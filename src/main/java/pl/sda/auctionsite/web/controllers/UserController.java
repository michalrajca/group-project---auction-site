package pl.sda.auctionsite.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import pl.sda.auctionsite.model.entity.User;
import pl.sda.auctionsite.model.services.UserService;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String user(){
        return "userPage";
    }

    @PostMapping("/registration")
    public String addUser(@ModelAttribute @Valid User user, Errors errors) {
        if (errors.hasErrors()) {
            return "registration";
        }
        userService.addUser(user);
        return "userPage";
    }

    @GetMapping("/registration")
    public String registration(Model model){
        model.addAttribute("user", new User());
        return "registration";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }


    @RequestMapping(value = "/user/modify/{login}", method = RequestMethod.PUT)
    public String modifyUser(@RequestBody User user, @PathVariable String login) {
        userService.modifyUser(user, login);
        return "userPage";
    }

    @RequestMapping(value = "/user/delete/{login}", method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable String login) {
        userService.deleteUser(login);
        return "homePage";
    }

}