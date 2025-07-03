package org.example.lesson_13

fun main() {
    val pepsi = PhoneBook("Pepsi" , 999666)
    pepsi.printContact()
}

class PhoneBook(
    var name: String ,
    var phoneNumber: Long ,
    var company: String? = null
) {
    fun printContact() {
        println(
            """
            name = $name
            phoneNumber = $phoneNumber
            company = $company
        """.trimIndent()
        )
    }
}