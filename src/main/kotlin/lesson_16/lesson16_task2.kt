package org.example.lesson_16

private const val PI = 3.14

fun main() {

    val circle = Circle(5)
    println("Длина окружности: ${"%.2f".format(circle.getLength())}")
    println("Площадь круга: ${circle.getArea()}")

}

class Circle(private val radius: Int) {
    fun getArea(): Double {
        return PI * radius * radius
    }

    fun getLength(): Double {
        return 2 * PI * radius
    }
}