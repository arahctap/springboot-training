package paloit.sp02.repository;
import paloit.sp02.dbmodel.Booking;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "bookings", path = "bookings")
public interface BookingRepository extends JpaRepository<Booking, Long>{
    Optional<List<Booking>> findAllByRoomId(Integer roomId);
    Optional<List<Booking>> findAllByOrganizerId(Integer organizerId);
}
