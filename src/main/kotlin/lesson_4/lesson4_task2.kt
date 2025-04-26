package org.example.lesson_4

const val MIN_AVERAGE_WEIGHT = 35
const val MAX_AVERAGE_WEIGHT = 100
const val MAX_AVERAGE_VOLUME = 100

fun main(){
    var cargoWeight = 20
    var cargoVolume = 80
    println("Груз с весом $cargoWeight кг и объемом $cargoVolume л соответствует категории 'Average': " +
            "${cargoWeight > MIN_AVERAGE_WEIGHT && cargoWeight <= MAX_AVERAGE_WEIGHT && cargoVolume < MAX_AVERAGE_VOLUME}")

    cargoWeight = 50
    cargoVolume = 100
    println("Груз с весом $cargoWeight кг и объемом $cargoVolume л соответствует категории 'Average': " +
            "${cargoWeight > MIN_AVERAGE_WEIGHT && cargoWeight <= MAX_AVERAGE_WEIGHT && cargoVolume < MAX_AVERAGE_VOLUME}")
}