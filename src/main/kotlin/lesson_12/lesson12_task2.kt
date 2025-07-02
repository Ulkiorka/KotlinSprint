package org.example.lesson_12

fun main() {
    val today = weather_1(10,-10, true)
    val yesterday = weather_1(0, 5, false)

    today.printData()
    yesterday.printData()

    today.daytimeTemperature = 30
    today.printData()
}

class weather_1(
    _daytimeTemperature : Int ,
    _nighttimeTemperature : Int ,
    _precipitation : Boolean ,
) {
    var daytimeTemperature = _daytimeTemperature
    var nighttimeTemperature = _nighttimeTemperature
    var precipitation = _precipitation

    fun printData() {
        println("daytimeTemperature = $daytimeTemperature")
        println("nighttimeTemperature = $nighttimeTemperature")
        println("precipitation = $precipitation")
        println()
    }
}