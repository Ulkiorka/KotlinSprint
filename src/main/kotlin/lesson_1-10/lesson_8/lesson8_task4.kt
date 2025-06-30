package org.example.`lesson_1-10`.lesson_8
fun main(){
    val ingredients = arrayOf("колбаса", "яйцо", "соль", "перец", "греча", "кура")
    println("Список ингредиентов: ${ingredients.joinToString(", ")}")

    println("Какой ингредиент необходимо заменить?")
    val outcast = readln()

    val index = ingredients.indexOf(outcast)
    if (index == -1){
        println("Такого ингредиента нет в списке")
        return
    }
    else {
        println("Каким ингредиентом необходимо заменить?")
        val newIngredient = readln()
        ingredients[index] = newIngredient
    }

    println("Готово! Вы сохранили следующий список: ${ingredients.joinToString(", ")}")
}