package org.example.lesson_4

fun main(){
    val minAverageWeight = 35
    val maxAverageWeight = 100
    val maxAverageVolume = 100

    var cargoWeight = 20
    var cargoVolume = 80
    println("Груз с весом $cargoWeight кг и объемом $cargoVolume л соответствует категории 'Average': " +
            "${cargoWeight > minAverageWeight && cargoWeight <= maxAverageWeight && cargoVolume < maxAverageVolume}")

    cargoWeight = 50
    cargoVolume = 100
    println("Груз с весом $cargoWeight кг и объемом $cargoVolume л соответствует категории 'Average': " +
            "${cargoWeight > minAverageWeight && cargoWeight <= maxAverageWeight && cargoVolume < maxAverageVolume}")
}