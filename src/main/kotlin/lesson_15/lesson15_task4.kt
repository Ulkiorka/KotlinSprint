package org.example.lesson_15

fun main() {
    val drum = Instrument("Барабаны", 5)
    val drumsticks = Component("Барабанные палочки", 10)
    drum.printInfo()
    drumsticks.printInfo()
    drum.searchAppropriateComponents()
}

interface Search {
    fun searchAppropriateComponents()
}

abstract class Category(
    val name: String,
    val count: Int,
) {
    fun printInfo() {
        println("Название: $name, количество: $count")
    }
}

class Instrument(name: String, count: Int) : Category(name, count), Search {
    override fun searchAppropriateComponents() {
        println("Выполняется поиск соответствующих комплектующих для [$name]")
    }

}

class Component(name: String, count: Int) : Category(name, count)