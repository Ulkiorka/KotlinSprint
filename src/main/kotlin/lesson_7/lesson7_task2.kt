package org.example.lesson_7

import kotlin.ranges.random

fun main() {
    var authorized = false
    val smsCodeRange = 1000..9999

    while (!authorized) {
        val smsCode = smsCodeRange.random()
        println("Ваш код авторизации: $smsCode")
        print("Введите код из SMS: ")
        val userInput = readln().toInt()
        if (userInput == smsCode) {
            authorized = true
            println("Добро пожаловать! Авторизация успешно завершена.")
        } else {
            println("Неверный код. Отправляем новый")
        }
    }
}