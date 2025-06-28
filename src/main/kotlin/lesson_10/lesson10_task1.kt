package org.example.lesson_10

fun main() {
    val playerMove = rollDice()
    println("Игрок выбросил число: $playerMove")
    val computerMove = rollDice()
    println("Компьютер выбросил число: $computerMove")

    when {
        playerMove > computerMove -> println("Победило человечество")
        playerMove < computerMove -> println("Победила машина")
        else -> println("Победила дружба")
    }
}

fun rollDice() = (1..6).random()

