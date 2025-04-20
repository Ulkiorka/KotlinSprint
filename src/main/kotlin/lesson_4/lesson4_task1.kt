package org.example.lesson_4

fun main(){
    val totalAmount = 13
    val today = 13
    val tomorrow = 9

    println("[Доступность столиков на сегодня: ${today < totalAmount}],")
    print( "[Доступность столиков на завтра: ${tomorrow < totalAmount}].")
}