package program.repository;

import program.model.Airstrip;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class AirstripRepository {
    private List<Airstrip> airstripList = new ArrayList<>();

    private Airstrip addAirstrip(UUID airstripNumber, String airportName, int airportLenght){
        Airstrip airstrip = new Airstrip(airstripNumber,airportName,airportLenght);
        airstripList.add(airstrip);
        return airstrip;
    }
}
