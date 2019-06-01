package pl.sda.auctionsite.web.controllers;

import org.springframework.web.bind.annotation.RestController;
import pl.sda.auctionsite.model.services.UserService;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
}
