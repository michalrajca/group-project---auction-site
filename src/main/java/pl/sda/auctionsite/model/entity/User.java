package pl.sda.auctionsite.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table
public class User {

    @Id
    @Column(unique = true)
    private String login;

    @Column
    private String password;

    @Column
    private String accountName;

    @Column
    private String province;

    @Column
    private String city;

    @Column
    private String streetName;

    @Column
    private String houseNo;

    @Column
    private String postcode;

    @Column
    private LocalDate accountCreationDate;

    @Column
    private String accountStatus;

    @Column
    private String avatarHref;

    @Column
    private String accountType;

    public User() {
    }

    public User(String login, String password, String accountName, String province, String city, String streetName, String houseNo, String postcode, LocalDate accountCreationDate, String accountStatus, String avatarHref, String accountType) {
        this.login = login;
        this.password = password;
        this.accountName = accountName;
        this.province = province;
        this.city = city;
        this.streetName = streetName;
        this.houseNo = houseNo;
        this.postcode = postcode;
        this.accountCreationDate = accountCreationDate;
        this.accountStatus = accountStatus;
        this.avatarHref = avatarHref;
        this.accountType = accountType;
    }


}
