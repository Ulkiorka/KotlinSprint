package org.example.lesson_8

fun main(){
    val ingredients = arrayOf("колбаса", "яйцо", "соль", "перец", "греча", "кура")
    print("Введите ингредиент: ")
    val userInput = readln()
    var found = false
    for (ingredient in ingredients) {
        if (ingredient == userInput) {
            found = true
            break
        }
    }

    if (found) {
        println("Ингредиент '$userInput' в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}