package org.example.lesson_12

fun main() {
    val monthlyWeather = List(30) {
        WeatherV5(
            (250..300).random() ,
            (240..280).random() ,
            listOf(true , false).random()
        )
    }

    val allDayTemperatureCelsius = monthlyWeather.map { it.daytimeTemperatureCelsius }
    val allNightTemperatureCelsius = monthlyWeather.map { it.nighttimeTemperatureCelsius }

    val averageDayTemperature = allDayTemperatureCelsius.average()
    val averageNightTemperature = allNightTemperatureCelsius.average()
    val rainyDays = monthlyWeather.count { it.precipitation }

    println("Средняя дневная температура за месяц: ${"%.2f".format(averageDayTemperature)}°C")
    println("Средняя ночная температура за месяц: ${"%.2f".format(averageNightTemperature)}°C")
    println("Количество дней с осадками за месяц: $rainyDays")
}

class WeatherV5(
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