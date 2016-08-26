package models


data class Itinerary(
        var totalFareAmount: Float = 0F,
        var totalTaxAmount: Float = 0F,
        var flightGroups: List<FlightGroup> = mutableListOf()
)