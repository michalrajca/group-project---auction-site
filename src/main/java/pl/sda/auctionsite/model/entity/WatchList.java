package pl.sda.auctionsite.model.entity;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class WatchList {

    private Auction auction;
    private User user;

    public WatchList() {
    }

    public WatchList(Auction auction, User user) {
        this.auction = auction;
        this.user = user;
    }
}
