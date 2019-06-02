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

//    public List<Auction> lastAddedAuctions(){
//        return auctionRepository.
//    }

//    public List<Auction> endingAuctions(){
//
//    }
//
//    public List<Auction> userAuctions(){
//
//    }
//
//    public List<Auction> biddingAuctions(){
//
//    }
//
//    public List<Auction> watchListAuctions(){
//
//    }
//
//    public List<Auction> endedAuctions(){
//
//    }
}
