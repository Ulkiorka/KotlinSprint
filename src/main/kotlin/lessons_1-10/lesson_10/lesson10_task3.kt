package org.example.`lesson_1-10`.lesson_10

fun main() {
    println("Введите длину пароля")
    val length = readln().toInt()
    println(generatePassword(length))
}

fun generatePassword(length: Int): String {
    val password = StringBuilder()
    val digits = '0'..'9'
    val symbols = ' '..'/'

    for (i in 1..length) {
        if (i % 2 != 0)
            password.append(digits.random())
        else
            password.append(symbols.random())
    }
    return password.toString()
}

