package org.example.lesson_10

fun main() {
    println("Введите логин")
    val login = readln()

    println("Введите пароль")
    val password = readln()

    if (validate(login, password))
        println("Welcome to the club buddy")
    else
        println("Логин или пароль недостаточно длинные")
}

fun validate(login: String, password: String) = (login.length >= 4 && password.length >= 4)