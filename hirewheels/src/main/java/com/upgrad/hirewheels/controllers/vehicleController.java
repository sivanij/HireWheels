package com.upgrad.hirewheels.controllers;

import com.upgrad.hirewheels.dto.vehicleDTO;
import com.upgrad.hirewheels.entities.vehicle;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class vehicleController {
    @GetMapping(value="/hirewheels/v1/vehicles",produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllMovies() {
        List<vehicle> movieList = vService.getAllMoviesDetails();
        List<vehicleDTO> movieDTOList = new ArrayList<>();
        for(Movie movie : movieList){
            movieDTOList.add(modelmapper.map(movie,MovieDTO.class));
        }
        return new ResponseEntity<>(movieDTOList, HttpStatus.OK);
    }
}
