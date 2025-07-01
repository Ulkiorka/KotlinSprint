package org.example.lesson_11

fun main() {
    val user = User(1 , "Пикачу" , "12345" , "mail@email.pika")
    user.showAllFields()
    println()
    user.changeBio()
    println()
    user.showAllFields()
    user.changePassword()
    user.showAllFields()
}

class User(
    val userId: Int ,
    val login: String ,
    var password: String ,
    val email: String ,
    var bio: String? = null ,
) {
    fun showAllFields() {
        println("userId = $userId")
        println("login = $login")
        println("password = $password")
        println("email = $email")
        println("bio = $bio")
    }

    fun changeBio() {
        println("Введите текст описания: ")
        bio = readln()
    }

    fun changePassword() {
        println("Введите текущий пароль: ")
        val text = readln()
        if (password == text) {
            println("Введите новый пароль: ")
            password = readln()
        } else {
            println("Неверный пароль")
        }
    }
}