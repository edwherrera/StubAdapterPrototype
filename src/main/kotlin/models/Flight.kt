package models

import java.time.LocalDate


data class Flight(
        var departureGate: String = "",
        var departureDate: String = "",
        var departureTime: String = "",
        var departureTerminal: String = "",
        var arrivalGateway: String = "",
        var arrivalDate: String = "",
        var arrivalTime: String = "",
        var arrivalTerminal: String = "",
        var marketingCarrier: String = "",
        var operatingCarrier: String = "",
        var flightNumber: String = "",
        var aircraftType: String = "",
        var cabinType: String = "",
        var redEye: Boolean = false
)