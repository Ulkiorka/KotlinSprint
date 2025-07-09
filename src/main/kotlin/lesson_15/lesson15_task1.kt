package org.example.lesson_15

fun main() {
    listOf(
        CrucianCarp("Карась"),
        Duck("Утка"),
        Seagull("Чайка")
    ).forEach { it.print() }
}

open class Animal(val name: String) {
    open fun print() {
        println("\nЖивотное: $name")
    }
}

interface Swimmable {
    fun swim() {
        println("Умеет плавать")
    }
}

interface Flyable {
    fun fly() {
        println("Умеет летать")
    }
}

class CrucianCarp(name: String) : Animal(name), Swimmable {
    override fun print() {
        super.print()
        swim()
    }
}

class Duck(name: String) : Animal(name), Swimmable, Flyable {
    override fun print() {
        super.print()
        swim()
        fly()
    }
}

class Seagull(name: String) : Animal(name), Flyable {
    override fun print() {
        super.print()
        fly()
    }
}