package org.example.lesson_10

fun main(){
    println("Введите логин")
    val login = readln()

    println("Введите пароль")
    val password = readln()

    validate(login, password)
}

fun validate(login: String , password: String) {
    if (login.length < 4 || password.length < 4)
        println("Логин или пароль недостаточно длинные")
    else
        println("Welcome to the club buddy")
}