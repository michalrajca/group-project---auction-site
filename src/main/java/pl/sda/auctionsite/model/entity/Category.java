package pl.sda.auctionsite.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Category {

    public Category() {
    }

    @Id
    private String name;

    @Column
    private String description;

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }

}
