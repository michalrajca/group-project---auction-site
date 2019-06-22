package pl.sda.auctionsite.web.controllers;

import pl.sda.auctionsite.model.services.AuctionService;

public class AuctionController {

    private final AuctionService auctionService;

    public AuctionController(AuctionService auctionService) {
        this.auctionService = auctionService;
    }
}
