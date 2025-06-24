package org.example.lesson_7

fun main(){
    val password = StringBuilder()
    val letters = 'a'..'z'
    val digits = '0'..'9'

    for (i in 1..3) {
        password.append(letters.random())
        password.append(digits.random())
    }
    println(password)
}