package org.example.lesson_8
fun main(){
    print("Введите количество ингредиентов: ")
    val amount = readln().toInt()
    val ingredients = Array(amount){""}
    for (i in 0 until amount){
        println("Введите ингридиент ${i+1}:")
        ingredients[i] = readln()
    }
    println("Список ингредиентов:" + ingredients.joinToString(" "))
}