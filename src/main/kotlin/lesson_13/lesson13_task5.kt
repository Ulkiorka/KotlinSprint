package org.example.lesson_13

fun main() {
    println("Введите имя контакта:")
    val name = readln()

    println("Введите номер контакта:")
    val number = try {
        readln().toLong()
    } catch (e: NumberFormatException) {
        println("Ошибка при вводе номера контакта: $e")
        return
    }

    println("Введите компанию:")
    val company = readln()

    println("Создан контакт:")
    ContactV5(name, number, company).printContact()
}

class ContactV5(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printContact() {
        println(
            "-Имя: $name \n-Номер: $phoneNumber \n-Компания: ${company ?: "<не указано>"}"
        )
    }
}