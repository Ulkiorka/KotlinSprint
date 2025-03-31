package org.example.lesson_2

fun main() {
    val firstStudent = 3
    val secondStudent = 4
    val thirdStudent = 3
    val fourthStudent = 5
    val numberOfStudents = 4

    val arithmeticMean : Double = (firstStudent + secondStudent + thirdStudent + fourthStudent).toDouble() / numberOfStudents
    println(arithmeticMean)
}