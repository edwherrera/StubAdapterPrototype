package data

class TerminalRepository {

    companion object{
        val ALL_TERMINALS = listOf(
                "A",
                "B",
                "C",
                "D",
                "E",
                "F"
        )
    }

    fun allTerminals(): List<String> {
        return ALL_TERMINALS
    }

}