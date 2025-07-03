package org.example.lesson_12

const val CELSIUS_KELVIN_OFFSET = 273

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

    val daytimeTemperatureCelsius = _daytimeTemperatureKelvin - CELSIUS_KELVIN_OFFSET
    val nighttimeTemperatureCelsius = _nighttimeTemperatureKelvin - CELSIUS_KELVIN_OFFSET
    var precipitation = _precipitation

    fun printData() {
        println("Дневная температура = $daytimeTemperatureCelsius °C")
        println("Ночная температура = $nighttimeTemperatureCelsius °C")
        println("Осадки = $precipitation")
        println()
    }
}