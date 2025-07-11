package org.example.lesson_16

fun main() {
    val dice = Dice()
    println("Число на игральном кубике: ${dice.getNumber()}")
}

class Dice() {
    private var sideNumber = (1..6).random()
    fun getNumber(): Int {
        return sideNumber
    }
}