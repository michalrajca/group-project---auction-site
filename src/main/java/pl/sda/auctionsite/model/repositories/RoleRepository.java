package pl.sda.auctionsite.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.auctionsite.model.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);

}
