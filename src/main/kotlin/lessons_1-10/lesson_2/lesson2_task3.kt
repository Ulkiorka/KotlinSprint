package org.example.`lesson_1-10`.lesson_2

const val MINUTES_IN_HOUR = 60
const val HOURS_IN_DAY = 24

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelTimeMinutes = 457

    val totalMinutes = departureHour * MINUTES_IN_HOUR + departureMinute + travelTimeMinutes
    val arrivalHour = (totalMinutes / MINUTES_IN_HOUR) % HOURS_IN_DAY
    val arrivalMinute = totalMinutes % MINUTES_IN_HOUR

    println("Время прибытия: $arrivalHour:$arrivalMinute")
}