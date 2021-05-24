package program.TextGui;

import program.model.Airstrip;
import program.model.Flight;
import program.model.FlightState;
import program.service.AirstripService;
import program.service.FlightService;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Scanner;
import java.util.UUID;

public class MainView {
    Scanner input = new Scanner(System.in);
    FlightService flightService;
    AirstripService airstripService;


    public MainView(FlightService flightService, AirstripService airstripService) {
        this.flightService = flightService;
        this.airstripService = airstripService;
    }

    public Airstrip addAirstrip(){
        UUID airstripNumber = UUID.randomUUID();
        System.out.println("Input name of the airstrip: ");
        String airstripName = input.next();
        System.out.println("Input lenght of the airstrip");
        int airstripLenght = input.nextInt();
        return airstripService.addAirstrip(airstripNumber,airstripName,airstripLenght);
    }

    public Flight addFlight(){
        UUID planeNumber = UUID.randomUUID();
        System.out.println("Insert starting airstrip informations");
        Airstrip startingAirstrip = addAirstrip();
        System.out.println("Insert landing airstrip informations");
        Airstrip landingAirstrip = addAirstrip();
        LocalTime startingTime = LocalTime.of(input.nextInt(), input.nextInt());
        LocalTime landingTime = LocalTime.of(input.nextInt(), input.nextInt());
        System.out.println("Flight state is turned as a planned:");
        FlightState flightState = FlightState.PLANNED;


        return flightService.addFlight(planeNumber,
                startingAirstrip,
                landingAirstrip,
                startingTime,
                landingTime,
                flightState);
    }
}
