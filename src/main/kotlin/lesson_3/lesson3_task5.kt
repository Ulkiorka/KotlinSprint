package org.example.lesson_3

fun main(){
    val serverString = "D2-D4;0"

    val from = serverString.split("-")[0]
    val to = serverString.split("-",";")[1]
    val counter = serverString.split(";")[1].toInt()

    println("Откуда: $from")
    println("Куда: $to")
    println("Номер хода: $counter")
}