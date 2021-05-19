package program.repository;

import program.model.Airstrip;
import program.model.Flight;
import program.model.FlightState;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FlightRepository {
    private List<Flight> flightList = new ArrayList<>();

    private void addFlight(UUID planeNumber
            , Airstrip startingAirstrip
            , Airstrip landingAirstrip
            , LocalTime startingTime
            , LocalTime landingTime
            ,FlightState flightState){
        Flight flight = new Flight(planeNumber
                ,startingAirstrip
                ,landingAirstrip
                ,startingTime
                ,landingTime
                ,flightState);
        flightList.add(flight);
    }

    private List<Flight> showAllFlights(){
        for (Flight flight:flightList) {
            System.out.println(flight);
        }
        return flightList;
    }

    private void setFlightState(Flight flight, FlightState flightState){
        flight.setFlightState(flightState);
    }


}
