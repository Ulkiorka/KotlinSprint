package org.example.lesson5

fun main() {
    val number1 = (0..42).random()
    val number2 = (0..42).random()

    println("Угадайте два числа от 0 до 42")

    print("Введите первое число: ")
    val userNumber1 = readln().toInt()
    print("Введите второе число: ")
    val userNumber2 = readln().toInt()

    if (userNumber1 == number1 && userNumber2 == number2 || userNumber1 == number2 && userNumber2 == number1)
        println("Поздравляем! Вы выиграли главный приз!")
    else if (userNumber1 == number1 || userNumber1 == number2 || userNumber2 == number1 || userNumber2 == number2)
        println("Вы выиграли утешительный приз!")
    else
        println("Неудача!")

    println("Выигрышные числа: $number1 и $number2")
}