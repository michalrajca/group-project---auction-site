package pl.sda.auctionsite.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Bid {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "auction_id")
    private Auction auction;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column
    private double price;

    public Bid(Auction auction, User user, double price) {
        this.auction = auction;
        this.user = user;
        this.price = price;
    }

    public Bid() {
    }
}
