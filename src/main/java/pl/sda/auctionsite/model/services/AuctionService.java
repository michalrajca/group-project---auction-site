package pl.sda.auctionsite.model.services;

import org.springframework.stereotype.Component;
import pl.sda.auctionsite.model.repositories.AuctionRepository;

@Component
public class AuctionService {

    private final AuctionRepository auctionRepository;

    public AuctionService(AuctionRepository auctionRepository) {
        this.auctionRepository = auctionRepository;
    }


}
