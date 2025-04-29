package org.example.lesson5

import kotlin.random.Random

fun main(){
    val number1 = Random.nextInt(0, 9)
    val number2 = Random.nextInt(0, 9)
    val correctSum = number1 + number2

    println("Докажите, что вы не бот. Решите пример: $number1 + $number2 = ?")
    print("Введите ответ: ")
    val userAnswer = readln().toInt()
    println(if (userAnswer == correctSum) "Добро пожаловать!" else "Доступ запрещен.")
}
