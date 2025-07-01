package org.example.lesson_11

fun main() {
    val user1 = User(1 , "Пикачу" , "pika-pika" , "mail@email.pika")
    val user2 = User(2 , "Слоупок" , "Yadon" , "mail@email.yadon")
    user1.showAllFields()
    println()
    user2.showAllFields()
}

class User(
    val userId: Int ,
    val login: String ,
    val password: String ,
    val email: String ,
) {
    fun showAllFields() {
        println("userId = $userId")
        println("login = $login")
        println("password = $password")
        println("email = $email")
    }
}