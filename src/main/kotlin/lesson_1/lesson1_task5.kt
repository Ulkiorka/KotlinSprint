package org.example.lesson_1

const val MINUTES_IN_HOUR = 60
const val SECONDS_IN_MINUTE = 60

fun main() {
    val totalSecondsInSpace: Int = 6480
    val hours: Int = totalSecondsInSpace / (MINUTES_IN_HOUR * SECONDS_IN_MINUTE)
    val minutes: Int = totalSecondsInSpace / SECONDS_IN_MINUTE % MINUTES_IN_HOUR
    val seconds: Int = totalSecondsInSpace % SECONDS_IN_MINUTE
    val formattedTimeInSpace : String = String.format("%02d:%02d:%02d", hours, minutes, seconds)
    println(formattedTimeInSpace)
}