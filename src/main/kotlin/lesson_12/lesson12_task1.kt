package org.example.lesson_12

fun main() {
    val today = Weather()
    val yesterday = Weather()

    today.daytimeTemperature = 10
    today.nighttimeTemperature = -10
    today.precipitation = true

    today.printData()
    yesterday.printData()

    today.daytimeTemperature = 30
    today.printData()
}

class Weather(
) {
    var daytimeTemperature = 0
    var nighttimeTemperature = 0
    var precipitation = false

    fun printData() {
        println("daytimeTemperature = $daytimeTemperature")
        println("nighttimeTemperature = $nighttimeTemperature")
        println("precipitation = $precipitation")
        println()
    }
}