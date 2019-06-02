package pl.sda.auctionsite.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@Entity
public class PurchaseRating {

    @Id
    private Long id;

    @OneToOne
    private Purchase purchase;

}
