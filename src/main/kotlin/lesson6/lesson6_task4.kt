package org.example.lesson6

fun main() {
    val vienas = 1
    val devyni = 9
    val number =  (vienas..devyni).random()
    var attempt = 5
    var guess : Int
    println("Необходимо за $attempt попыток угадать число от $vienas до $devyni")
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