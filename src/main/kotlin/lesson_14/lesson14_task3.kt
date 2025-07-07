package org.example.lesson_14

import java.awt.Color
import kotlin.math.PI

fun main() {
    val circle = Circle(Color.RED, 5)
    println(
        """
        Круг: 
        Радиус: ${circle.radius}
        Площадь: ${circle.area()}
        Периметр:  ${circle.perimeter()}
    """.trimIndent()
    )
    val rectangle = Rectangle(Color.RED, 5, 10)
    println(
        """
        Прямоугольник:
        Ширина: ${rectangle.width}
        Высота: ${rectangle.height}
        Площадь: ${rectangle.area()}
        Периметр:  ${rectangle.perimeter()}
    """.trimIndent()
    )
}

abstract class Figure(color: Color) {
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
