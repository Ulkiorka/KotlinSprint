package org.example.lesson6

fun main(){
    val seconds = readln().toLong()
        Thread.sleep(seconds * 1000)
    println("Прошло $seconds секунд")
}