package org.example.`lesson_1-10`.lesson_7
fun main(){
    print("Введите количество секунд ")
    val numberOfSeconds = readln().toInt()
    for (remainingSesonds in numberOfSeconds downTo 1){
        println("Осталось $remainingSesonds")
        Thread.sleep(1000)
    }
    println("Время вышло")
}