package org.example.lesson_11

fun main(){
    val user1 = User(1,"Пикачу", "pika-pika", "mail@email.pika")
    val user2 = User(2,"Слоупок", "Yadon", "mail@email.yadon")
    user1.showAllFields()
    println()
    user2.showAllFields()
}