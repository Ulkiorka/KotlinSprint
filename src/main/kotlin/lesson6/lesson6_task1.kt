package org.example.lesson6

fun main() {
    print("Создайте логин: ")
    val registeredLogin = readln()
    print("Создайте пароль: ")
    val registeredPassword = readln()
    println("Войдите в систему.")

    while (true) {
        print("Введите логин: ")
        val inputLogin = readln()
        print("Введите пароль: ")
        val inputPassword = readln()
        if (inputLogin == registeredLogin && inputPassword == registeredPassword) {
            println("Авторизация прошла успешно!")
            break
        } else
            println("Неверный логин или пароль. Попробуйте ещё раз.")
    }
}