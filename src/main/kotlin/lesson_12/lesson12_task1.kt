package org.example.lesson_12

fun main() {
    val today = weather()
    val yesterday = weather()

    today.daytimeTemperature = 10
    today.nighttimeTemperature = -10
    today.precipitation = true

    today.printData()
    yesterday.printData()

    today.daytimeTemperature = 30
    today.printData()
}

class weather(
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