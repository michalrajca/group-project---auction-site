package pl.sda.auctionsite.model.repositories;

        import org.springframework.data.domain.Page;
        import org.springframework.data.domain.Pageable;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.data.jpa.repository.Query;
        import pl.sda.auctionsite.model.entity.Auction;
        import pl.sda.auctionsite.model.entity.Category;
        import pl.sda.auctionsite.model.entity.User;

        import java.time.LocalDateTime;
        import java.util.List;

public interface AuctionRepository extends JpaRepository<Auction,Long> {

//        @Query("SELECT auction from Auction auction ")
    List<Auction> findFirst10ByOrderByStartDateDesc ();

    List<Auction> findFirst10ByOrderByEndDateDesc ();

    List<Auction> findAllByUserAndEndDateAfter (User user, LocalDateTime localDateTime);

    Page<Auction> findAllByCategory (Category category, Pageable pageable);



}
