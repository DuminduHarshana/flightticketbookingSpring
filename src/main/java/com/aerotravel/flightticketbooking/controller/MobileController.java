package com.aerotravel.flightticketbooking.controller;

import com.aerotravel.flightticketbooking.model.AuthUser;
import com.aerotravel.flightticketbooking.model.Flight;
import com.aerotravel.flightticketbooking.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class MobileController {

    @Autowired
    UserService userService;
    @Autowired
    AirportService airportService;
    @Autowired
    AircraftService aircraftService;
    @Autowired
    FlightService flightService;
    @Autowired
    PassengerService passengerService;

    @GetMapping("/")
    public String test() {
        return "Test API";
    }

    //auth part
    @PostMapping("/login")
    public ResponseEntity<Boolean> authenticateUser(@RequestBody AuthUser userDetails){
        return ResponseEntity.ok(userService.loginUser(userDetails.getUsername(),userDetails.getPassword())) ;
    }

    @GetMapping("/flights")
    public ResponseEntity<List<Flight>> getAllFlight(){
        return ResponseEntity.ok(flightService.getAllFlights());
    }


}
