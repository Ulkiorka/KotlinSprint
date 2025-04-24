package org.example.lesson_4
fun main() {
    print("Отсутствуют повреждения (true или false): ")
    val hasNoDamaged = readln().toBoolean()
    print("Численность экипажа: ")
    val crewCount = readln().toInt()
    print("Количество ящиков провизии: ")
    val foodBoxes = readln().toInt()
    print("Погода благоприятна (true или false): ")
    val isGoodWeather = readln().toBoolean()

    val canSail = (hasNoDamaged && crewCount in 55..70 && foodBoxes > 50) ||
            (crewCount == 70 && isGoodWeather && foodBoxes >= 50)

    println("Судно может отправиться в рейс: $canSail")
}