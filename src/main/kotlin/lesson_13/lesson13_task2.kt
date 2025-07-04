package org.example.lesson_13

fun main() {
    val pepsi = ContactV2("Ростислав", 999666)
    pepsi.printContact()
}

class ContactV2(
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