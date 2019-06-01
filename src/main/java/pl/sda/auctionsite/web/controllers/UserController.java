package pl.sda.auctionsite.web.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.auctionsite.model.entity.User;
import pl.sda.auctionsite.model.services.UserService;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @RequestMapping
    public void modifyUser(User user, String login) {
        userService.modifyUser(user, login);
    }

    @RequestMapping
    public void deleteUser(String login) {
        userService.deleteUser(login);
    }

}
