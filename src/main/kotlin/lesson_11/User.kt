package org.example.lesson_11

class User(
    val userId: Int,
    val login: String,
    val password: String,
    val email: String,
) {
    fun showAllFields(){
        println("userId = $userId")
        println("login = $login")
        println("password = $password")
        println("email = $email")
    }
}