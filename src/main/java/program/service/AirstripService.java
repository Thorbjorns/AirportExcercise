package program.service;

import program.repository.AirstripRepository;

public class AirstripService {

    private AirstripRepository airstripRepository;

    public AirstripService(AirstripRepository airstripRepository) {
        this.airstripRepository = airstripRepository;
    }
}
