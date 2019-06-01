package pl.sda.auctionsite.model.entity;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Bid {

    private Auction auction;
    private User user;
    private double price;

    public Bid(Auction auction, User user, double price) {
        this.auction = auction;
        this.user = user;
        this.price = price;
    }

    public Bid() {
    }
}
