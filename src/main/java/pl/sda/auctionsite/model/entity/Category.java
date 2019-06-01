package pl.sda.auctionsite.model.entity;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Category {

    public Category() {
    }

    private String name;
    private String description;

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }

}
