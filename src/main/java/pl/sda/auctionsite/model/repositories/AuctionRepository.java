package pl.sda.auctionsite.model.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.sda.auctionsite.model.entity.Auction;

import java.util.List;

public interface AuctionRepository extends JpaRepository<Auction,Long> {


//    Page<Auction> findByS

}
