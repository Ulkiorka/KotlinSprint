package org.example.lesson6

fun main(){
    val seconds = readln().toInt()
    var timer = seconds
    while (timer > 0){
        timer--
        Thread.sleep(1000)
    }
    println("Прошло $seconds секунд")
}