package org.example.lesson_13

fun main() {
    val phoneBook: List<ContactV3> = listOf(
        ContactV3("Ростислав", 999666),
        ContactV3("Леонид", 123456, null),
        ContactV3("Камиль", 222333, "null"),
        ContactV3("Александр", 444555, "Мексиканские негодяи"),
        ContactV3("Сергей", 666777, "Квартет И")
    )
    println("Список компаний: ${phoneBook.mapNotNull { it.company }}")
}

class ContactV3(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
}