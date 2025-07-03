package org.example.`lesson_1-10`.lesson_7

fun main() {
    println("Введите число:")
    val userNumber = readln().toInt()
    for (number in 0..userNumber step 2)
        println(number)
}