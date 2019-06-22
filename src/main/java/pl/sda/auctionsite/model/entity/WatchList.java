package pl.sda.auctionsite.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Entity
public class WatchList {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "auction_id")
    private Auction auction;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public WatchList() {
    }

    public WatchList(Auction auction, User user) {
        this.auction = auction;
        this.user = user;
    }
}
