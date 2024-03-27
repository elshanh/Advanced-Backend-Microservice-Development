package az.eh.restaurants.model;

import az.eh.restaurants.dao.entity.Restaurants;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Getter
@Setter
public class RestaurantsTableDTO {

    private Long id;
    private String tableNo;
    private Long restaurantId;
}
