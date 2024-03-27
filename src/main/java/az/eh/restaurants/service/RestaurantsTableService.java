package az.eh.restaurants.service;

import az.eh.restaurants.dao.entity.Restaurants;
import az.eh.restaurants.dao.entity.RestaurantsTable;
import az.eh.restaurants.model.RestaurantsTableDTO;

import java.util.List;

public interface RestaurantsTableService {
	List<RestaurantsTableDTO> getAllRestaurantsTable();
	RestaurantsTable getRestaurantTableById(Long id);
	RestaurantsTable saveRestaurantTable(RestaurantsTable restaurantTable);
	void deleteRestaurantTable(Long id);
}
