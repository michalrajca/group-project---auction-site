package pl.sda.auctionsite.model.entity;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class PurchaseRating {

    private Purchase purchase;

}
