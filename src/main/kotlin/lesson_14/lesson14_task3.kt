package org.example.lesson_14

import java.awt.Color
import kotlin.math.PI

fun main() {
    val listOfFigures = listOf(
        Circle(Color.WHITE, 5),
        Circle(Color.BLACK, 7),
        Rectangle(Color.BLACK, 5, 10),
        Rectangle(Color.WHITE, 3, 4)
    )
    val blackPerimeterSum = listOfFigures
        .filter { it.color == Color.BLACK }
        .sumOf { it.perimeter() }

    val whiteAreaSum = listOfFigures
        .filter { it.color == Color.WHITE }
        .sumOf { it.area() }
    println("Сумма периметров черных фигур: $blackPerimeterSum")
    println("Сумма площадей белых фигур: $whiteAreaSum")
}

abstract class Figure(val color: Color) {
    abstract fun area(): Double
    abstract fun perimeter(): Double
}

class Circle(
    color: Color,
    val radius: Int,
) : Figure(color = color) {
    override fun area(): Double {
        return PI * radius * radius
    }

    override fun perimeter(): Double {
        return 2 * PI * radius
    }
}

class Rectangle(
    color: Color,
    val width: Int,
    val height: Int
) : Figure(color = color) {
    override fun area(): Double {
        return (width * height).toDouble()
    }

    override fun perimeter(): Double {
        return (2 * (width + height)).toDouble()
    }
}
