package adapters;

import data.AirlineRepository;
import data.TerminalRepository;
import models.FareSearchRequest;
import models.Flight;
import models.FlightGroup;
import models.Itinerary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StubAdapter {

    private final TerminalRepository terminalRepository;

    public StubAdapter() {
        terminalRepository = new TerminalRepository();
    }

    public Itinerary fareSearch(final FareSearchRequest request) {
        final Itinerary itinerary = new Itinerary();
        final int fareAmount = generateRandom(1500, 3000);
        itinerary.setTotalFareAmount(fareAmount);
        itinerary.setTotalTaxAmount(fareAmount * 7.5F);

        List<FlightGroup> flightGroups = new ArrayList<>();

        for (int i = 0; i < 250; i += 1) {
            final FlightGroup flightGroup = new FlightGroup();

            Flight flight = new Flight();
            flight.setDepartureDate(request.getDepartureDate().toString());
            flight.setDepartureGate(request.getDepartureGateway());
            flight.setDepartureTerminal(
                    terminalRepository.allTerminals().get(generateRandom(0, terminalRepository.allTerminals().size())));
            flight.setDepartureTime(randomTime());
            flight.setArrivalDate(request.getDepartureDate().toString());
            flight.setAircraftType(randomAircraft());
            flight.setArrivalTerminal(
                    terminalRepository.allTerminals().get(generateRandom(0, terminalRepository.allTerminals().size())));
            flight.setArrivalTime(randomlyAddedTime());
            flight.setCabinType("???????");
            flight.setFlightNumber("" + generateRandom(1, 5000));
            flight.setRedEye(generateRandom(0, 2) == 1);
            flight.setMarketingCarrier("???????");
            flight.setOperatingCarrier("???????");
            flight.setArrivalGateway(randomGateway());

            if (request.getNonstop() || (generateRandom(0, 500) > 250)) {
                flightGroup.setFlights(Collections.singletonList(flight));
            } else {
                Flight intermediateFlight = new Flight();
                intermediateFlight.setDepartureDate(request.getDepartureDate().toString());
                intermediateFlight.setDepartureGate(flight.getArrivalGateway());
                intermediateFlight.setDepartureTerminal(
                        terminalRepository.allTerminals().get(generateRandom(0, terminalRepository.allTerminals().size())));
                intermediateFlight.setDepartureTime(randomlyAddedTime());
                intermediateFlight.setAircraftType(randomAircraft());
                intermediateFlight.setArrivalTime(randomlyAddedTime());
                intermediateFlight.setCabinType("??????");
                intermediateFlight.setFlightNumber("" + generateRandom(1, 5000));
                intermediateFlight.setRedEye(generateRandom(0, 2) == 1);
                intermediateFlight.setMarketingCarrier("?????");
                intermediateFlight.setOperatingCarrier("???????");
                intermediateFlight.setArrivalGateway(randomGateway());

                flightGroup.setFlights(Arrays.asList(flight, intermediateFlight));
            }

            flightGroup.setFlightTime(calculateFlightTime());
            flightGroup.setTravelTime(calculateTravelTime());
            flightGroup.setMixedCabins(generateRandom(0,2) == 1);

            flightGroups.add(flightGroup);
        }


        itinerary.setFlightGroups(flightGroups);
        return itinerary;
    }

    private String calculateTravelTime() {
        return "";
    }

    private String calculateFlightTime() {
        return "";
    }

    private String randomGateway() {
        return "";
    }

    private String randomCabinType() {
        return "";
    }

    private String randomlyAddedTime() {
        return "";
    }

    private String randomAircraft() {
        return "";
    }

    private String randomTime() {
        return "";
    }

    private int generateRandom(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
