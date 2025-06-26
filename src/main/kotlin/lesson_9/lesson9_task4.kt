package org.example.lesson_9
fun main(){
    println("Введите 5 ингредиентов, разделённых запятой с пробелом")
    val inputText = readln().trim()
    val listeDeProduites = inputText.split(", ").toMutableList()
    println("В рецепте есть следующие ингредиенты: ")
    val sortedList = listeDeProduites.sorted()
    println(sortedList)
}