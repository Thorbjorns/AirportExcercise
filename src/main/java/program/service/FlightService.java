package program.service;

import program.model.Airstrip;
import program.model.Flight;
import program.model.FlightState;
import program.repository.FlightRepository;

import java.time.LocalTime;
import java.util.UUID;

public class FlightService {

    private FlightRepository flightRepository = new FlightRepository();



    public Flight addFlight(UUID planeNumber,
                          Airstrip startingAirtstrip,
                          Airstrip landingAirstrip,
                          LocalTime startingTime,
                          LocalTime landingTime,
                          FlightState flightState){
      return flightRepository.addFlight(planeNumber
                ,startingAirtstrip
                ,landingAirstrip
                ,startingTime,
                landingTime
                ,flightState);

    }

}
