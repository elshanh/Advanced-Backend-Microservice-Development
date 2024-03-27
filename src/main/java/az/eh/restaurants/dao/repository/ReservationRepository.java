package az.eh.restaurants.dao.repository;

import az.eh.restaurants.dao.entity.Reservation;
import az.eh.restaurants.dao.entity.Restaurants;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long>{

}
