package pl.sda.auctionsite.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table
public class User {

    @Id
    @Column(unique = true, nullable = false)
    private String login;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String accountName;

    @Column(nullable = false)
    private String province;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String streetName;

    @Column(nullable = false)
    private String houseNo;

    @Column(nullable = false)
    private String postcode;

    @Column(nullable = false)
    private LocalDate accountCreationDate;

    @Column(nullable = false)
    private String accountStatus;

    @Column(nullable = false)
    private String avatarHref;

    @Column(nullable = false)
    private String accountType;

    public User() {
    }

    public User(String login, String password, String accountName, String province, String city, String streetName, String houseNo, String postcode, String avatarHref) {
        this.login = login;
        this.password = password;
        this.accountName = accountName;
        this.province = province;
        this.city = city;
        this.streetName = streetName;
        this.houseNo = houseNo;
        this.postcode = postcode;
        this.accountCreationDate = LocalDate.now();
        this.accountStatus = "Active";
        this.avatarHref = avatarHref;
        this.accountType = "Normal";
    }


}
