package org.example.lesson_8
fun main(){
    val ingredients = arrayOf("колбаса", "яйцо", "соль", "перец", "греча", "кура")
    println("Список ингредиентов: ${ingredients.joinToString(", ")}")

    println("Какой ингредиент необходимо заменить?")
    val outcast = readln()

    if (!ingredients.contains(outcast)){
        println("Такого ингредиента нет в списке")
        return
    }

    println("Каким ингредиентом необходимо заменить?")
    val newIngredient = readln()
    val index = ingredients.indexOf(outcast)
    ingredients[index] = newIngredient

    println("Готово! Вы сохранили следующий список: ${ingredients.joinToString(", ")}")
}