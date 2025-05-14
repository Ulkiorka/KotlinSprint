package org.example.lesson6

fun main(){
    var seconds = readln().toInt()
    while (seconds > 0){
        Thread.sleep(1000)
        println("Осталось секунд: ${--seconds}")
    }
    println("Время вышло")
}