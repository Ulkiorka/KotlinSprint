package org.example.lesson_13

fun main() {
    val phoneBook = mutableListOf<ContactV4>()
    var typeOneMoreContact = true

    while (typeOneMoreContact) {
        println("Введите имя контакта")
        val name = readln()

        println("Введите номер телефона")
        val phoneNumber = readln().toLongOrNull()
        if (phoneNumber == null) {
            println("отсутствует номер телефона")
            break
        }

        println("Введите компанию")
        val company = readln().isEmpty().toString()

        phoneBook.add(ContactV4(name, phoneNumber, company))
        println("Добавить ещё контакт? (yes/да - продолжить, иначе - завершение ввода новых контактов)")

        val typeElse = readln()
        if (typeElse != "yes" && typeElse != "да")
            typeOneMoreContact = false
    }
    println("Список контактов телефонной книги:")
    phoneBook.forEach { it.printContact() }
}

class ContactV4(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printContact() {
        println(
            "\n-Имя: $name \n-Номер: $phoneNumber \n-Компания: ${company ?: "<не указано>"}"
        )
    }
}