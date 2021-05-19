package program;

import program.TextGui.MainView;
import program.model.Airstrip;
import program.repository.AirstripRepository;
import program.repository.FlightRepository;
import program.service.AirstripService;
import program.service.FlightService;

public class Main {
    public static void main(String[] args) {
        FlightRepository flightRepository = new FlightRepository();
        AirstripRepository airstripRepository = new AirstripRepository();
        FlightService flightService = new FlightService(flightRepository);
        AirstripService airstripService = new AirstripService(airstripRepository);
        MainView mainView = new MainView(flightService,airstripService);


    }
}
