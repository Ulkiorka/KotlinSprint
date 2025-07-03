package org.example.`lesson_1-10`.lesson_4

const val TOTAL_AMOUNT = 13

fun main(){

    val today = 13
    val tomorrow = 9

    println("[Доступность столиков на сегодня: ${today < TOTAL_AMOUNT}],")
    print( "[Доступность столиков на завтра: ${tomorrow < TOTAL_AMOUNT}].")
}