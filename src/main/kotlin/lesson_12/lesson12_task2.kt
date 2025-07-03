package org.example.lesson_12

fun main() {
    val today = WeatherV2(10 , -10 , true)
    val yesterday = WeatherV2(0 , 5 , false)

    today.printData()
    yesterday.printData()

    today.daytimeTemperature = 30
    today.printData()
}

class WeatherV2(
    var daytimeTemperature: Int ,
    var nighttimeTemperature: Int ,
    var precipitation: Boolean ,
) {

    fun printData() {
        println("daytimeTemperature = $daytimeTemperature")
        println("nighttimeTemperature = $nighttimeTemperature")
        println("precipitation = $precipitation")
        println()
    }
}