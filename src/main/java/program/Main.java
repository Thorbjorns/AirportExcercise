package program;

import program.TextGui.MainView;
import program.model.Airstrip;
import program.repository.AirstripRepository;
import program.repository.FlightRepository;
import program.service.AirstripService;
import program.service.FlightService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FlightRepository flightRepository = new FlightRepository();
        AirstripRepository airstripRepository = new AirstripRepository();
        FlightService flightService = new FlightService(flightRepository);
        AirstripService airstripService = new AirstripService(airstripRepository);
        MainView mainView = new MainView(flightService,airstripService);
        boolean running = true;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome in airport manager program!");

        while(running){
            System.out.println("1: Add flight.");
            System.out.println("2: Edit state of a flight");
            System.out.println("3: Check all flights");
            System.out.println("0: Exit program");
            int choice = input.nextInt();

            switch (choice){
                case 0 -> running = false;
                case 1 -> mainView.addFlight();
                case 3 -> mainView.showAllFlights();
            }


        }

    }
}
