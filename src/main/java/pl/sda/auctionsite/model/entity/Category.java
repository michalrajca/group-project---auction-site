package pl.sda.auctionsite.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Category {

    public Category() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Long id;

    @Column(unique = true,nullable = false)
    private String name;

    @Column
    private String description;

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }

}
