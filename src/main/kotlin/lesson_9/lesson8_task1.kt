package org.example.lesson_9
fun main(){
    val listeDeProduites = listOf("колбаса", "яйцо", "соль", "перец", "греча", "кура")
    println("В рецепте есть следующие ингредиенты: ")
    listeDeProduites.forEach { println(it) }
}