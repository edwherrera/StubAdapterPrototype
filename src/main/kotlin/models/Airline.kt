package models

import java.time.LocalDate

data class Airline (
        var id: Int,
        var code: String,
        var name: String,
        var created: LocalDate = LocalDate.now(),
        var countryId: Int
)
