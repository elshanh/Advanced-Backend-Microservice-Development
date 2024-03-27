package az.eh.restaurants.dao.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "RESTAURANTS")
public class Restaurants {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "OPEN", nullable = false)
    private String open;

    @Column(name = "CLOSE", nullable = false)
    private String close;

    @Column(name = "ADDRESS")
    private String address;
}
