package pl.sda.auctionsite.web.controllers;

import org.springframework.stereotype.Controller;
import pl.sda.auctionsite.model.services.AuctionService;

@Controller
public class AuctionController {

    private final AuctionService auctionService;

    public AuctionController(AuctionService auctionService) {
        this.auctionService = auctionService;
    }


}
