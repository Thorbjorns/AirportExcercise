package program.model;

import java.time.LocalTime;
import java.util.UUID;

public class Flight {
    private UUID planeNumber;
    private Airstrip startingAirstrip;
    private Airstrip landingAirstrip;
    private LocalTime startingTime;
    private LocalTime landingTime;
    private FlightState flightState;

    public Flight(UUID planeNumber
            ,Airstrip startingAirstrip
            ,Airstrip landingAirstrip
            ,LocalTime startingTime
            ,LocalTime landingTime
            ,FlightState flightState) {
        this.planeNumber = planeNumber;
        this.startingAirstrip = startingAirstrip;
        this.landingAirstrip = landingAirstrip;
        this.startingTime = startingTime;
        this.landingTime = landingTime;
        this.flightState = flightState;
    }

    public UUID getPlaneNumber() {
        return planeNumber;
    }

    public void setPlaneNumber(UUID planeNumber) {
        this.planeNumber = planeNumber;
    }

    public Airstrip getStartingAirstrip() {
        return startingAirstrip;
    }

    public void setStartingAirstrip(Airstrip startingAirstrip) {
        this.startingAirstrip = startingAirstrip;
    }

    public Airstrip getLandingAirstrip() {
        return landingAirstrip;
    }

    public void setLandingAirstrip(Airstrip landingAirstrip) {
        this.landingAirstrip = landingAirstrip;
    }

    public LocalTime getStartingTime() {
        return startingTime;
    }

    public void setStartingTime(LocalTime startingTime) {
        this.startingTime = startingTime;
    }

    public LocalTime getLandingTime() {
        return landingTime;
    }

    public void setLandingTime(LocalTime landingTime) {
        this.landingTime = landingTime;
    }

    public FlightState getFlightState() {
        return flightState;
    }

    public void setFlightState(FlightState flightState) {
        this.flightState = flightState;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "planeNumber=" + planeNumber +
                ", startingAirstrip=" + startingAirstrip +
                ", landingAirstrip=" + landingAirstrip +
                ", startingTime=" + startingTime +
                ", landingTime=" + landingTime +
                ", flightState=" + flightState +
                '}';
    }
}
