package dev.mounika.BookMyShow.service;

import dev.mounika.BookMyShow.model.City;
import dev.mounika.BookMyShow.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServices {
    @Autowired
    private CityRepository cityRepository;
    public City saveCity(String cityName){
        City city = new City();
        city.setName(cityName);
        return cityRepository.save(city);
    }

    public boolean deleteCity(int cityId){
        cityRepository.deleteById(cityId);
        return true;
    }
}
