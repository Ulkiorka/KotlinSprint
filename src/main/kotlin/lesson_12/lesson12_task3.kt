package org.example.lesson_12

fun main() {
    val today = WeatherV3(100 , 0 , true)
    val yesterday = WeatherV3(273 , 240 , false)

    today.printData()
    yesterday.printData()
}

class WeatherV3(
    _daytimeTemperatureKelvin: Int ,
    _nighttimeTemperatureKelvin: Int ,
    _precipitation: Boolean ,
) {

    var daytimeTemperatureCelsius = _daytimeTemperatureKelvin - 273
    var nighttimeTemperatureCelsius = _nighttimeTemperatureKelvin - 273
    var precipitation = _precipitation

    fun printData() {
        println("daytimeTemperature = $daytimeTemperatureCelsius")
        println("nighttimeTemperature = $nighttimeTemperatureCelsius")
        println("precipitation = $precipitation")
        println()
    }
}