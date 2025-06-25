package org.example.lesson_7

fun main(){
    var password = ""
    val letters = 'a'..'z'
    val digits = '0'..'9'

    for (i in 1..3) {
        password += letters.random()
        password +=  digits.random()
    }
    println(password)
}