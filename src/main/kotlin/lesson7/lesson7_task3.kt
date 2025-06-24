package org.example.lesson7

fun main() {
    println("Введите число:")
    val userNumber = readln().toInt()
    for (number in 0..userNumber step 2)
        println(number)
}