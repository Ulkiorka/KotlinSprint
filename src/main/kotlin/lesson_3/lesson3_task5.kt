package org.example.lesson_3

fun main(){
    val serverString = "D2-D4;0"

    val splittedServerString = serverString.split("-", ";")

    println("Откуда: ${splittedServerString[0]}")
    println("Куда: ${splittedServerString[1]}")
    println("Номер хода: ${splittedServerString[2]}")
}