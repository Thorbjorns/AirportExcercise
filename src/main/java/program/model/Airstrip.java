package program.model;

import java.util.UUID;

public class Airstrip {
    private UUID airstripNUmber;
    private String airportName;
    private int airportLenght;

    public UUID getAirstripNUmber() {
        return airstripNUmber;
    }

    public void setAirstripNUmber(UUID airstripNUmber) {
        this.airstripNUmber = airstripNUmber;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public int getAirportLenght() {
        return airportLenght;
    }

    public void setAirportLenght(int airportLenght) {
        this.airportLenght = airportLenght;
    }

    @Override
    public String toString() {
        return "Airstrip{" +
                "airstripNUmber=" + airstripNUmber +
                ", airportName='" + airportName + '\'' +
                ", airportLenght=" + airportLenght +
                '}';
    }
}
