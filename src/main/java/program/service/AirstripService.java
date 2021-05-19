package program.service;

import program.model.Airstrip;
import program.repository.AirstripRepository;

import java.util.UUID;

public class AirstripService {

    private AirstripRepository airstripRepository;

    public AirstripService(AirstripRepository airstripRepository) {
        this.airstripRepository = airstripRepository;
    }

    public Airstrip addAirstrip(UUID airstripNumber, String airportName, int airportLenght){
        return airstripRepository.addAirstrip(airstripNumber,airportName,airportLenght);
    }
}
