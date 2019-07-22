package pl.sda.auctionsite.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.auctionsite.model.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByLogin(String login);

    void deleteByLogin(String login);

}