package az.eh.restaurants.service.impl;

import az.eh.restaurants.dao.entity.Restaurants;
import az.eh.restaurants.dao.repository.RestaurantsRepository;
import az.eh.restaurants.service.RestaurantsService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantsServiceImpl implements RestaurantsService {

	@Autowired
	private RestaurantsRepository restaurantsRepository;

	@Override
	public List<Restaurants> getAllRestaurants() {
		return restaurantsRepository.findAll();
	}

	@Override
	public Restaurants getRestaurantById(Long id) {
		return restaurantsRepository.findById(id).orElse(null);
	}

	@Override
	public Restaurants saveRestaurant(Restaurants restaurant) {
		return restaurantsRepository.save(restaurant);
	}

	@Override
	public void deleteRestaurant(Long id) {
		restaurantsRepository.deleteById(id);
	}
}
