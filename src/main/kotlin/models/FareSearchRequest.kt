package models

import java.time.LocalDate

data class FareSearchRequest(
        var departureGateway: String,
        var departureDate: LocalDate,
        var arrivalDate: LocalDate,
        var adults: Int = 2,
        var children: Int = 0,
        var infants: Int = 0,
        var nonstop: Boolean = false,
        var preferredAirlines: List<Airline> = listOf()
)