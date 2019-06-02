package pl.sda.auctionsite.model.entity;

import com.sun.deploy.security.ValidationState;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class WatchList {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "auction_title")
    private Auction auction;

    @ManyToOne
    @JoinColumn(name = "user_login")
    private User user;

    public WatchList() {
    }

    public WatchList(Auction auction, User user) {
        this.auction = auction;
        this.user = user;
    }
}
