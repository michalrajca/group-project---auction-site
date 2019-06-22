package pl.sda.auctionsite.model.services;

import org.springframework.stereotype.Component;
import pl.sda.auctionsite.model.entity.Auction;
import pl.sda.auctionsite.model.repositories.AuctionRepository;

import java.util.List;

@Component
public class AuctionService {

    private final AuctionRepository auctionRepository;

    public AuctionService(AuctionRepository auctionRepository) {
        this.auctionRepository = auctionRepository;
    }

    public List<Auction> lastAddedAuctions(){
        return auctionRepository.findFirst10ByOrderByStartDateDesc();
    }

    public List<Auction> endingAuctions(){
        return null;
    }

    public List<Auction> userAuctions(){
        return null;
    }

    public List<Auction> biddingAuctions(){
        return null;
    }

    public List<Auction> watchListAuctions(){
        return null;
    }

    public List<Auction> endedAuctions(){
        return null;
    }

}
