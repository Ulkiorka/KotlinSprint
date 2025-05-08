package org.example.lesson5

fun main(){
    val number1 =  (1..10).random()
    val number2 =  (1..10).random()
    val correctSum = number1 + number2

    println("Докажите, что вы не бот. Решите пример: $number1 + $number2 = ?")
    print("Введите ответ: ")
    val userAnswer = readln().toInt()
    println(if (userAnswer == correctSum) "Добро пожаловать!" else "Доступ запрещен.")
}
