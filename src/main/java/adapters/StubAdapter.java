package adapters;

import data.AirlineRepository;
import data.TerminalRepository;
import models.FareSearchRequest;
import models.Flight;
import models.FlightGroup;
import models.Itinerary;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.time.LocalTime;
import java.util.List;

public class StubAdapter {

    private final TerminalRepository terminalRepository;
    private final AirlineRepository airlineRepository;

    public StubAdapter() {
        terminalRepository = new TerminalRepository();
        airlineRepository = new AirlineRepository();
    }

    public Itinerary fareSearch(final FareSearchRequest request) {
        final Itinerary itinerary = new Itinerary();
        final int fareAmount = generateRandom(1500, 3000);
        itinerary.setTotalFareAmount(fareAmount);
        itinerary.setTotalTaxAmount(fareAmount * 7.5F);

        FlightGroup inComing = new FlightGroup();

        for (int i = 0; i < 10; i += 1) {
            final FlightGroup outGoing = new FlightGroup();

            Flight outFlight = new Flight();
            outFlight.setDepartureDate(request.getDepartureDate().toString());
            outFlight.setDepartureGate(request.getDepartureGateway());
            outFlight.setDepartureTerminal(
                    terminalRepository.allTerminals().get(generateRandom(0, terminalRepository.allTerminals().size())));
        }

        throw new NotImplementedException();
    }

    private int generateRandom(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
