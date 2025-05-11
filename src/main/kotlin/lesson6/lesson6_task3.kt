package org.example.lesson6

fun main(){
    val seconds = readln().toInt()
    var timer = seconds
    while (timer > 0){
        Thread.sleep(1000)
        println("Осталось секунд: ${--timer}")
    }
    println("Прошло $seconds секунд")
}