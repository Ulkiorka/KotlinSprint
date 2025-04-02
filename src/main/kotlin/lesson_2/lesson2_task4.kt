package org.example.lesson_2

fun main(){
    val crystalWithoutBuff = 7
    val ironWithoutBuff = 11
    val buffMultiplier = 0.20
    val crystalBonus = (crystalWithoutBuff * buffMultiplier).toInt()
    val ironBonus = (ironWithoutBuff * buffMultiplier).toInt()

    println("Дополнительная кристаллическая руда: $crystalBonus")
    println("Дополнительная железная руда: $ironBonus")
}