package org.example.lesson_1

fun main() {
    val totalSecondsInSpace: Int = 6480
    val hours: Int = totalSecondsInSpace / 3600
    val minutes: Int = totalSecondsInSpace / 60 % 60
    val seconds: Int = totalSecondsInSpace % 60
    val formattedTimeInSpace : String = String.format("%02d:%02d:%02d", hours, minutes, seconds)
    println(formattedTimeInSpace)
}