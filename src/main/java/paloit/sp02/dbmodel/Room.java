package paloit.sp02.dbmodel;

import java.sql.Time;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

import lombok.NoArgsConstructor;

import org.springframework.lang.Nullable;


@Entity
@NoArgsConstructor
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Size(min = 3, max = 50)
    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "room", fetch = FetchType.LAZY)
    private List<Booking> bookings;

    @Min(1)
    private Integer capacity;

    @Nullable
    private Time openTime;

    @Nullable
    private Time closeTime;

    public List<Booking> getBookings() {
        return this.bookings;
    }

    public Room(Integer id, String name, Integer capacity, Time openTime, Time closeTime) {
        super();
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.openTime = openTime;
        this.closeTime = closeTime;
    }
}
