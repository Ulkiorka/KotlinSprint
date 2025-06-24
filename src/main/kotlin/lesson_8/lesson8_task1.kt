package org.example.lesson_8

fun main(){
        val viewsPerDay = arrayOf(10000, 5000, 777, 1000, 500)
        var totalViews = 0
        for (dayViews in viewsPerDay)
            totalViews += dayViews
        println("Просмотров за неделю: $totalViews")
}