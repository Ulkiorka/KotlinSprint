package org.example.lesson_9
fun main(){
    println("Введите 5 уникальных названий ингридиентов")
    val mutableSet = mutableSetOf<String>()
    for (i in 1..5){
        mutableSet.add(readln().lowercase())
    }

    val sortedList = mutableSet.sorted().toMutableList()
    sortedList[0] = sortedList[0].replaceFirstChar { it.titlecase() }
    println(sortedList.joinToString(", "))
}