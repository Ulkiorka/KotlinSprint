package org.example.lesson_12

fun main() {
    val today = WeatherV4(100 , 0 , true)
    val yesterday = WeatherV4(273 , 240 , false)
}

class WeatherV4(
    _daytimeTemperatureKelvin: Int ,
    _nighttimeTemperatureKelvin: Int ,
    _precipitation: Boolean ,
) {

    var daytimeTemperatureCelsius = _daytimeTemperatureKelvin - 273
    var nighttimeTemperatureCelsius = _nighttimeTemperatureKelvin - 273
    var precipitation = _precipitation

    init {
        println("daytimeTemperature = $daytimeTemperatureCelsius")
        println("nighttimeTemperature = $nighttimeTemperatureCelsius")
        println("precipitation = $precipitation")
        println()
    }
}