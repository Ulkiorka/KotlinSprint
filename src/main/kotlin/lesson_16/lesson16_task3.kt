package org.example.lesson_16

fun main() {
    val user = User("Vasya", "12345")
    val testWord = "ololo"
    if (user.verifyPass(testWord))
        println("Пароль введён верно")
    else
        println("Пароль неверен")
}

class User(val login: String, private val password: String) {
    fun verifyPass(testWord: String): Boolean {
        return password == testWord
    }
}