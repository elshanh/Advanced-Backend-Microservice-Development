package az.eh.restaurants.service.impl;

import az.eh.restaurants.dao.entity.Restaurants;
import az.eh.restaurants.dao.entity.RestaurantsTable;
import az.eh.restaurants.dao.repository.RestaurantsRepository;
import az.eh.restaurants.dao.repository.RestaurantsTableRepository;
import az.eh.restaurants.model.RestaurantsTableDTO;
import az.eh.restaurants.service.RestaurantsService;
import az.eh.restaurants.service.RestaurantsTableService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantsTableServiceImpl implements RestaurantsTableService {

	@Autowired
	private RestaurantsTableRepository restaurantsTableRepository;

	@Override
	public List<RestaurantsTableDTO> getAllRestaurantsTable() {

		//List<RestaurantsTable> a1 = restaurantsTableRepository.findAll();
		//return restaurantsTableRepository.findAll();

		List<RestaurantsTableDTO> tableDTOs = new ArrayList<>();
		List<RestaurantsTable> tables = restaurantsTableRepository.findAll();

		for (RestaurantsTable table : tables) {
			RestaurantsTableDTO dto = new RestaurantsTableDTO();
			dto.setId(table.getId());
			dto.setTableNo(table.getTableNo());
			dto.setRestaurantId(table.getRestaurants().getId()); // Restoranın kimlik bilgisini al
			tableDTOs.add(dto);
		}

		return tableDTOs;
	}

	@Override
	public RestaurantsTable getRestaurantTableById(Long id) {
		return restaurantsTableRepository.findById(id).orElse(null);
	}

	@Override
	public RestaurantsTable saveRestaurantTable(RestaurantsTable restaurantsTable) {
		return restaurantsTableRepository.save(restaurantsTable);
	}

	@Override
	public void deleteRestaurantTable(Long id) {
		restaurantsTableRepository.deleteById(id);
	}
}
