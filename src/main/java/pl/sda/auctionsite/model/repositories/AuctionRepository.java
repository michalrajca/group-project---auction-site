package pl.sda.auctionsite.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.auctionsite.model.entity.Auction;

public interface AuctionRepository extends JpaRepository<Auction,Long> {



}
