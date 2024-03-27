package az.eh.restaurants.dao.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "RESTAURANTS_TABLE")
public class RestaurantsTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "TABLE_NO", nullable = false)
    private String tableNo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RESTAURANTS_ID", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Restaurants restaurants;
}
