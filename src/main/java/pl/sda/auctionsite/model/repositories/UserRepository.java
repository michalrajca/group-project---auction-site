package pl.sda.auctionsite.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.auctionsite.model.entity.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {

//    List<User> findByLogin(String login);
}
