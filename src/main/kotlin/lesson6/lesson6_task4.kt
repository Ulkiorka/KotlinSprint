package org.example.lesson6

fun main() {
    val number =  (1..9).random()
    var attempt = 5
    var guess : Int
    println("Необходимо за 5 попыток угадать число от 1 до 9")
    while (attempt > 0){
        attempt--
        guess = readln().toInt()
        if (guess == number) {
            println("Это была великолепная игра!")
            return
        }
        else {
            println("Неверно")
            println("Оставшееся количество попыток: $attempt")
        }
    }
    println("Было загадано число: $number")
}