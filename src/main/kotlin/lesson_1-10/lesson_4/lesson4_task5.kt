package org.example.`lesson_1-10`.lesson_4

const val MIN_CREW = 55
const val MAX_CREW = 70
const val NORMAL_AMOUNT_FOOD_BOXES = 50


fun main() {
    print("Отсутствуют повреждения (true или false): ")
    val hasNoDamaged = readln().toBoolean()
    print("Численность экипажа: ")
    val crewCount = readln().toInt()
    print("Количество ящиков провизии: ")
    val foodBoxes = readln().toInt()
    print("Погода благоприятна (true или false): ")
    val isGoodWeather = readln().toBoolean()

    val canSail = (hasNoDamaged && crewCount in MIN_CREW..MAX_CREW && foodBoxes > NORMAL_AMOUNT_FOOD_BOXES) ||
            (crewCount == MAX_CREW && isGoodWeather && foodBoxes >= NORMAL_AMOUNT_FOOD_BOXES)

    println("Судно может отправиться в рейс: $canSail")
}