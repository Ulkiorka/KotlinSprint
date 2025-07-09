package org.example.lesson_15

fun main() {
    val weatherServer = WeatherServer()

    weatherServer.sendToServer(Temperature(18.2))
    weatherServer.sendToServer(PrecipitationAmount(135.1))
}

abstract class WeatherStationStats {
    abstract val value: Double
}

class Temperature(override val value: Double) : WeatherStationStats()

class PrecipitationAmount(override val value: Double) : WeatherStationStats()

class WeatherServer() {
    fun sendToServer(weatherStationStats: WeatherStationStats) {
        when (weatherStationStats) {
            is Temperature -> println("Температура: ${weatherStationStats.value} C")
            is PrecipitationAmount -> println("Количество осадков: ${weatherStationStats.value} мм")
        }
    }
}