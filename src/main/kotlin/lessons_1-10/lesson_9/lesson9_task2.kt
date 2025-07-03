package org.example.`lesson_1-10`.lesson_9
fun main(){
    val listeDeProduites = mutableListOf("помидор", "огурец", "сметана")
    println("В рецепте есть базовые ингредиенты: $listeDeProduites")
    println("Желаете добавить еще? (да/нет)")
    val answer = readln()
    if (answer.equals("да")){
        println("Какой ингредиент вы хотите добавить?")
    }
    else
        return

    listeDeProduites.add(readln())
    println("Теперь в рецепте есть следующие ингредиенты: $listeDeProduites")
}

