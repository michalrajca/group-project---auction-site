package pl.sda.auctionsite.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.sda.auctionsite.model.entity.User;
import pl.sda.auctionsite.model.services.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String addUser(@RequestBody User user) {
        userService.addUser(user);
        return "user";
    }

    @RequestMapping(value = "/users/modify/{login}", method = RequestMethod.PUT)
    public String modifyUser(@RequestBody User user, @PathVariable String login) {
        userService.modifyUser(user, login);
        return "user";
    }

    @RequestMapping(value = "/users/delete/{login}", method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable String login) {
        userService.deleteUser(login);
        return "homePage";
    }

}
