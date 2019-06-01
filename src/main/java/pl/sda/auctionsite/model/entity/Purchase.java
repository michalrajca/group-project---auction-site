package pl.sda.auctionsite.model.entity;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Purchase {

    private Auction auction;
    private User user;
    private double price;

    public Purchase(Auction auction, User user, double price) {
        this.auction = auction;
        this.user = user;
        this.price = price;
    }

    public Purchase() {
    }
}
