package org.example.`lesson_1-10`.lesson_9
fun main(){
    println("Введите 5 ингредиентов, разделённых запятой с пробелом")
    val inputText = readln().trim()
    val listeDeProduites = inputText.split(", ").sorted()
    println("В рецепте есть следующие ингредиенты: ")
    println(listeDeProduites)
}