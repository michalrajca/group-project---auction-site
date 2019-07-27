package pl.sda.auctionsite.model.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import pl.sda.auctionsite.model.entity.Auction;
import pl.sda.auctionsite.model.repositories.AuctionRepository;

import java.util.List;

@Component
public class AuctionService {

    @Autowired
    private AuctionRepository auctionRepository;

    public List<Auction> lastAddedAuctions(){
        return auctionRepository.findFirst10ByOrderByStartDateDesc();
    }

    public List<Auction> endingAuctions(){
        return auctionRepository.findFirst10ByOrderByEndDateDesc();
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
