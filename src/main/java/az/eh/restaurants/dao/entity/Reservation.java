package az.eh.restaurants.dao.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "RESERVATION")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "TABLE_ID", nullable = false)
    private Long tableId;

    @Column(name = "RESERV_START_TIME", nullable = false)
    private String reservStartTime;

    @Column(name = "RESERV_END_TIME", nullable = false)
    private String reservEndTime;

    @Column(name = "STATUS")
    private String status;
}
