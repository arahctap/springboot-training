package paloit.sp02.repository;
import paloit.sp02.dbmodel.Room;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;
import java.time.LocalDateTime;

@RepositoryRestResource(collectionResourceRel = "rooms", path = "rooms")
public interface RoomRepository extends JpaRepository<Room, Long>{
    Optional<Room> findById(Integer id);
    Optional<List<Room>> findByName(String name);
}
