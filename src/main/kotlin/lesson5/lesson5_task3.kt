package org.example.lesson5

private const val BEGIN = 0
private const val END = 42

fun main() {
    val number1 = (BEGIN..END).random()
    val number2 = (BEGIN..END).random()

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