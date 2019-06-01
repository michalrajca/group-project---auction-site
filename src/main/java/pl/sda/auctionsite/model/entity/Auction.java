package pl.sda.auctionsite.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class Auction {

    public Auction() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Long id;

    String title;
    String description;
//    String href;
    Category category;
    double minimalPrice;
    double buyPrice;
    boolean positioned;
    User user;
    LocalDateTime startDate;
    LocalDateTime endDate;
    int count;

    public Auction(String title, String description, Category category, double minimalPrice, double buyPrice, boolean positioned, User user, LocalDateTime startDate, LocalDateTime endDate, int count) {
        this.title = title;
        this.description = description;
        this.category = category;
        this.minimalPrice = minimalPrice;
        this.buyPrice = buyPrice;
        this.positioned = positioned;
        this.user = user;
        this.startDate = startDate;
        this.endDate = endDate;
        this.count = count;
    }
}
