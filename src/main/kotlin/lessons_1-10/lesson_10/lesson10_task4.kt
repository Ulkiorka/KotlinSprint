package org.example.`lesson_1-10`.lesson_10

fun main() {
    var playerWin = 0
    var playAgain = true
    while (playAgain) {
        val playerMove = rollDice2()
        println("Игрок выбросил число: $playerMove")
        val computerMove = rollDice2()
        println("Компьютер выбросил число: $computerMove")

        when {
            playerMove > computerMove -> {
                println("Победило человечество"); playerWin++
            }

            playerMove < computerMove -> println("Победила машина")
            else -> println("Победила дружба")
        }
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        playAgain = askPlayer()
    }
    println("Выигрышных партик: $playerWin")
}

fun rollDice2(): Int {
    return (1..6).random()
}

fun askPlayer(): Boolean {
    val answer = readln().lowercase()
    return (answer == "да")
}

