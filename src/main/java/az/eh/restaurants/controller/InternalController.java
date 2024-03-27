package az.eh.restaurants.controller;

import az.eh.restaurants.dao.entity.Reservation;
import az.eh.restaurants.dao.entity.Restaurants;
import az.eh.restaurants.dao.entity.RestaurantsTable;
import az.eh.restaurants.model.RestaurantsTableDTO;
import az.eh.restaurants.service.ReservationService;
import az.eh.restaurants.service.RestaurantsService;
import az.eh.restaurants.service.RestaurantsTableService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/internal/api/v1")
@RequiredArgsConstructor
public class InternalController {

	@Autowired
	private ReservationService reservationService;

	@ApiOperation(value = "Reservation")
	@GetMapping("/reservation")
	public List<Reservation> getAllReservation() {
		return reservationService.getAllReservation();
	}

	@ApiOperation(value = "Reservation")
	@PostMapping("/reservation")
	public Reservation saveReservation(@RequestBody Reservation reservation) {
		return reservationService.saveReservation(reservation);
	}

	@ApiOperation(value = "Reservation")
	@DeleteMapping("/reservation/{id}")
	public void deleteReservation(@PathVariable Long id) {
		reservationService.deleteReservation(id);
	}
}
