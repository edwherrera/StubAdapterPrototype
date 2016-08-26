package data

import models.Airline

class AirlineRepository {

    companion object {
        val ALL_AIRLINES = listOf(
                Airline(1, "AC", "Air Canada", countryId = 38),
                Airline(2, "TS", "Air Transat", countryId = 38),
                Airline(3, "PD", "Porter Airlines", countryId = 38),
                Airline(4, "WS", "West Jet", countryId = 38),
                Airline(5, "AS", "Alaska Airlines", countryId = 233),
                Airline(6, "G4", "Allegiant Air", countryId = 233),
                Airline(7, "AA", "American Airlines", countryId = 233),
                Airline(8, "DL", "Delta Airlines", countryId = 233),
                Airline(9, "F9", "Frontier Airlines", countryId = 233),
                Airline(10, "HA", "Hawaiian Airlines", countryId = 233),
                Airline(11, "B6", "JetBlue Airlines", countryId = 233),
                Airline(12, "WN", "Southwest Airlines", countryId = 233),
                Airline(13, "NK", "Spirit Airlines", countryId = 233),
                Airline(14, "SY", "Sun Country", countryId = 233),
                Airline(15, "UA", "United Airlines", countryId = 233),
                Airline(16, "VX", "Virgin America", countryId = 233)
        )
    }

    fun allAirlines(): List<Airline> {
        return ALL_AIRLINES
    }

    fun randomAirline(): Airline {
        val min = 0
        val max = allAirlines().size - 1

        return allAirlines()[min + (Math.random() * ((max - min) + 1)).toInt()]
    }

}