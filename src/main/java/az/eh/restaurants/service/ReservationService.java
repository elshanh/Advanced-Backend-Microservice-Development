package az.eh.restaurants.service;

import az.eh.restaurants.dao.entity.Reservation;

import java.util.List;

public interface ReservationService {
	List<Reservation> getAllReservation();
	Reservation saveReservation(Reservation restaurant);
	void deleteReservation(Long id);
}
