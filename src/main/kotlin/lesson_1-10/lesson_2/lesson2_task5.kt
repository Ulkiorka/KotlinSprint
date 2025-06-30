package org.example.`lesson_1-10`.lesson_2

fun main(){
    val amount = 70_000
    val interestRate = 16.7
    val years = 20
    val finalAmount = amount * Math.pow(1 + interestRate / 100.0, years.toDouble())
    val formattedResult = "%.3f".format(finalAmount)
    println("$formattedResult рублей")
}