package org.example.lesson_14

fun main() {
    val liner = LinerV2("Titanic", 23, 2208)
    val cargo = CargoShipV2("Evergreen", 14, 14, 199489)
    val icebreaker = IcebreakerV2("Ленин", 18, 236)

    liner.printInfo()
    liner.loading()
    cargo.printInfo()
    cargo.loading()
    icebreaker.printInfo()
    icebreaker.loading()
}

open class LinerV2(
    val name: String,
    val speed: Int,
    val numberOfPassengers: Int,
){
    open fun loading(){
        println("Погрузка: Со шкафута выдвигается горизонтальный трап")
    }

    open fun printInfo(){
        println(
            """
            Сведения о судне:
            - Название: $name
            - Скорость: $speed узлов
            - Вместимость: $numberOfPassengers человек
            """.trimIndent()
        )
    }
}

class CargoShipV2(
    name: String,
    speed: Int,
    numberOfPassengers: Int,
    val capacity: Int
) : LinerV2(name, speed, numberOfPassengers){
    override fun loading(){
        println("Погрузка: Активируется погрузочный кран")
    }

    override fun printInfo(){
        super.printInfo()
        println("- Грузоподъемность: $capacity тонн")
    }
}

class IcebreakerV2(
    name: String,
    speed: Int,
    numberOfPassengers: Int,
    val canBreakIce: Boolean = true
) : LinerV2(name, speed, numberOfPassengers){
    override fun loading(){
        println("Погрузка: Открываются 'ворота' со стороны кормы")
    }

    override fun printInfo(){
        super.printInfo()
        println("- Способность раскалывать лёд: $canBreakIce")
    }
}