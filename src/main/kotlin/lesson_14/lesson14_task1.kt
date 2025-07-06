package org.example.lesson_14

fun main() {
    val liner = Liner("Titanic", 23, 2208)
    val cargo = CargoShip("Evergreen", 14, 14, 199489)
    val icebreaker = Icebreaker("Ленин", 18, 236)

}

open class Liner(
    val name: String,
    val speed: Int,
    val numberOfPassengers: Int,
)

class CargoShip(
    name: String,
    speed: Int,
    numberOfPassengers: Int,
    val capacity: Int
) : Liner(name, speed, numberOfPassengers)

class Icebreaker(
    name: String,
    speed: Int,
    numberOfPassengers: Int,
    val canBreakIce: Boolean = true
) : Liner(name, speed, numberOfPassengers)