package models

data class FlightGroup (
        var flightTime: String = "",
        var mixedCabins: Boolean = false,
        var travelTime: String = "",
        var flights: List<Flight> = mutableListOf()
)

