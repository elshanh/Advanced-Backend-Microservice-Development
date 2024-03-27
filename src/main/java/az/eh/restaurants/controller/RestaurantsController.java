package az.eh.restaurants.controller;

import az.eh.restaurants.dao.entity.Restaurants;
import az.eh.restaurants.dao.entity.RestaurantsTable;
import az.eh.restaurants.model.RestaurantsTableDTO;
import az.eh.restaurants.service.RestaurantsService;
import az.eh.restaurants.service.RestaurantsTableService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class RestaurantsController {

	@Autowired
	private RestaurantsService restaurantService;

	@Autowired
	private RestaurantsTableService restaurantsTableService;

	@ApiOperation(value = "Restaurants")
	@GetMapping("/restaurants")
	public List<Restaurants> getAllRestaurants() {
		return restaurantService.getAllRestaurants();
	}

	@GetMapping("/restaurants/{id}")
	public Restaurants getRestaurantById(@PathVariable Long id) {
		return restaurantService.getRestaurantById(id);
	}

	@PostMapping("/restaurants")
	public Restaurants saveRestaurant(@RequestBody Restaurants restaurants) {
		return restaurantService.saveRestaurant(restaurants);
	}

	@DeleteMapping("/restaurants/{id}")
	public void deleteRestaurant(@PathVariable Long id) {
		restaurantService.deleteRestaurant(id);
	}

	@GetMapping("/restaurants/table")
	public List<RestaurantsTableDTO> getAllRestaurantsTable() {
		return restaurantsTableService.getAllRestaurantsTable();
	}

	@GetMapping("/restaurants/table/{id}")
	public RestaurantsTable getRestaurantTableById(@PathVariable Long id) {
		return restaurantsTableService.getRestaurantTableById(id);
	}

	@PostMapping("/restaurants/table")
	public RestaurantsTable saveRestaurant(@RequestBody RestaurantsTable restaurantsTable) {
		return restaurantsTableService.saveRestaurantTable(restaurantsTable);
	}

	@DeleteMapping("/restaurants/table/{id}")
	public void deleteRestaurantTable(@PathVariable Long id) {
		restaurantsTableService.deleteRestaurantTable(id);
	}

}
