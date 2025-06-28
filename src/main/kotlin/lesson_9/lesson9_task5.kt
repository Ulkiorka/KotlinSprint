package org.example.lesson_9
fun main(){
    println("Введите 5 уникальных названий ингридиентов")
    val mutableSet = mutableSetOf<String>()
    for (i in 1..5){
        mutableSet.add(readln().lowercase())
    }

    val ingredients = mutableSet.sorted()
        .joinToString(separator = ", ", postfix = ".")
        .replaceFirstChar {
            it.uppercase()
        }
    println(ingredients)
}