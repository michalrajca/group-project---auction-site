package pl.sda.auctionsite.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pl.sda.auctionsite.model.services.AuctionService;

@Controller
public class AuctionController {

    @Autowired
    private AuctionService auctionService;


}
