package adapters;

import models.FareSearchRequest;
import models.FlightGroup;
import models.Itinerary;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class StubAdapter {

    public Itinerary fareSearch(final FareSearchRequest request) {
        final Itinerary itinerary = new Itinerary();
        final int fareAmount = generateRandom(1500, 3000);
        itinerary.setTotalFareAmount(fareAmount);
        itinerary.setTotalTaxAmount(fareAmount*7.5F);

        for (int i = 0; i < 250; i += 1) {
            FlightGroup outGoing = new FlightGroup();
        }

        throw new NotImplementedException();
    }

    private int generateRandom(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }
}
