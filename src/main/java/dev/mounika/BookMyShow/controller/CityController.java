package dev.mounika.BookMyShow.controller;

import dev.mounika.BookMyShow.dto.CityRequestDTO;
import dev.mounika.BookMyShow.model.City;
import dev.mounika.BookMyShow.service.CityServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CityController {
    @Autowired
    private CityServices cityServices;
    @PostMapping("/city")
    public ResponseEntity createCity(@RequestBody CityRequestDTO cityRequestDTO) {
        try {
            String cityName = cityRequestDTO.getName();
            if(cityName==null || cityName.isEmpty() || cityName.isBlank()) {
                throw new Exception("City Name is invalid");
            }
            City savedCity = cityServices.saveCity(cityName);
            return ResponseEntity.ok(savedCity);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @DeleteMapping("/city/{id}")
    public ResponseEntity deleteCity(@PathVariable("id") int cityId){
        boolean isDeleted = cityServices.deleteCity(cityId);
        return ResponseEntity.ok(isDeleted);
    }

}
