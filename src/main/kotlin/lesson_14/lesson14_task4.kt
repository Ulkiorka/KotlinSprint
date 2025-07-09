package org.example.lesson_14

fun main() {
    val satellite1 = Satellite("Ио", true, false)
    val satellite2 = Satellite("Ганимед", true, true)
    val jupiter = Planet("Юпитер", true, false, listOf(satellite1, satellite2))

    jupiter.printInfo()
    jupiter.listOfSatellites.forEach { it.printInfo() }
}

abstract class CelestialBody(
    val name: String,
    val hasAtmosphere: Boolean = false,
    val isSuitableForPlanting: Boolean = false,
) {
    open fun printInfo() {
        println(
            """
            Название: $name 
            Наличие атмосферы: $hasAtmosphere 
            Возможность высадки: $isSuitableForPlanting 
        """.trimIndent()
        )
    }
}

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    isSuitableForPlanting: Boolean,
    val listOfSatellites: List<Satellite> = mutableListOf()
) : CelestialBody(name, hasAtmosphere, isSuitableForPlanting) {
    override fun printInfo() {
        println("Планета")
        super.printInfo()
    }
}

class Satellite(
    name: String,
    hasAtmosphere: Boolean,
    isSuitableForPlanting: Boolean
) : CelestialBody(name, hasAtmosphere, isSuitableForPlanting) {
    override fun printInfo() {
        println("Спутник")
        super.printInfo()
    }
}