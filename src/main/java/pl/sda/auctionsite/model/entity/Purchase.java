package pl.sda.auctionsite.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Purchase {

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

    public Purchase(Auction auction, User user, double price) {
        this.auction = auction;
        this.user = user;
        this.price = price;
    }

    public Purchase() {
    }
}
