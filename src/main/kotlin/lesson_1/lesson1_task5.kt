package org.example.lesson_1

fun main() {
    val totalSecondsInSpace: Int = 6480
    val minutesInHour: Int = 60
    val secondsInMinute: Int = 60
    val hours: Int = totalSecondsInSpace / (minutesInHour * secondsInMinute)
    val minutes: Int = totalSecondsInSpace / secondsInMinute % minutesInHour
    val seconds: Int = totalSecondsInSpace % secondsInMinute
    val formattedTimeInSpace : String = String.format("%02d:%02d:%02d", hours, minutes, seconds)
    println(formattedTimeInSpace)
}