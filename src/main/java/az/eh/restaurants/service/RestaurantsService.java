package az.eh.restaurants.service;

import az.eh.restaurants.dao.entity.Restaurants;

import java.util.List;

public interface RestaurantsService {
	List<Restaurants> getAllRestaurants();
	Restaurants getRestaurantById(Long id);
	Restaurants saveRestaurant(Restaurants restaurant);
	void deleteRestaurant(Long id);
}
