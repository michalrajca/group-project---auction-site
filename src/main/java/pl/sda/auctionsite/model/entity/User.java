package pl.sda.auctionsite.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collection;

@Data
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length=44,unique = true,nullable = false)
    private String login;

    @Column(length=100,unique = true,nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Transient
    private String passwordConfirm;

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

    @ManyToMany
//    @JoinTable(
//            name = "users_roles",
//            joinColumns = @JoinColumn(
//                    name = "user_id", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(
//                    name = "role_id", referencedColumnName = "id"))
    private Collection<Role> roles;
}
