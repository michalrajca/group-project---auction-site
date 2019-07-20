package pl.sda.auctionsite.model.entity;

import lombok.Data;
import org.springframework.data.repository.support.Repositories;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.web.context.WebApplicationContext;
import pl.sda.auctionsite.model.repositories.RoleRepository;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true,nullable = false)
    private String login;

    @Column(unique = true,nullable = false)
    private String email;

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

    @ManyToMany
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"))
    private Collection<Role> roles;

    public User() {
    }

    public User(String login, String email, String password, String accountName, String province, String city, String streetName, String houseNo, String postcode, String avatarHref) {
        this.login = login;
        setEmail(email);
        this.password = BCrypt.hashpw(password,BCrypt.gensalt());
        this.accountName = accountName;
        this.province = province;
        this.city = city;
        this.streetName = streetName;
        this.houseNo = houseNo;
        this.postcode = postcode;
        this.accountCreationDate = LocalDate.now();
        this.accountStatus = "Active";
        this.avatarHref = avatarHref;

    }


}
