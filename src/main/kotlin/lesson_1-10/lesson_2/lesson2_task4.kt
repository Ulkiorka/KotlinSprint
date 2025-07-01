package org.example.`lesson_1-10`.lesson_2

fun main(){
    val amountPercentage = 20
    val crystalWithoutBuff = 7
    val ironWithoutBuff = 11
    val buffMultiplier = amountPercentage.toDouble() / 100
    val crystalBonus = (crystalWithoutBuff * buffMultiplier).toInt()
    val ironBonus = (ironWithoutBuff * buffMultiplier).toInt()

    println("Дополнительная кристаллическая руда: $crystalBonus")
    println("Дополнительная железная руда: $ironBonus")
}