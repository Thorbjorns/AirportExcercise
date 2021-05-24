package program.service;

import program.model.Airstrip;
import program.model.Flight;
import program.model.FlightState;
import program.repository.FlightRepository;

import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

public class FlightService {

    private FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

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

    public List<Flight> showAllFlights(){
        return flightRepository.showAllFlights();
    }

}
