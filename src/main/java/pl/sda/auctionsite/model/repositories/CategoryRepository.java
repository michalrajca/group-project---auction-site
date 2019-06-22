package pl.sda.auctionsite.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.auctionsite.model.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {



}