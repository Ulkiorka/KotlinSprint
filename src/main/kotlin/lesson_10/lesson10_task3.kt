package org.example.lesson_10

fun main(){
    println("Введите длину пароля")
    val length = readln().toInt()
    println(generatePassword(length))
}

fun generatePassword(len: Int) : String{
    var password = StringBuilder()
    var digits = (0..9)
    val symbols = """!"#$%&'()*+,-./ """.toList()
    for (i in 1..len){
        if (i % 2 != 0)
            password.append(digits.random())
        else
            password.append(symbols.random())
    }
    return password.toString()
}

