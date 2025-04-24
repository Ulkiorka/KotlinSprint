package org.example.lesson_4

const val REQUIRED_HUMIDITY = 20
const val FORBIDDEN_SEASON = "зима"

fun main(){
    val isSunnyWeather : Boolean = true
    val isTentOpen : Boolean = true

    val suitableConditions = isSunnyWeather && isTentOpen && REQUIRED_HUMIDITY == 20 && FORBIDDEN_SEASON != "зима"
    println("Благоприятные ли условия сейчас для роста бобовых? $suitableConditions")
}