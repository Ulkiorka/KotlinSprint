package org.example.lesson7

import kotlin.ranges.random

fun main() {
    var authorized = false

    while (!authorized) {
        val smsCode = (1000.. 10000).random()
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