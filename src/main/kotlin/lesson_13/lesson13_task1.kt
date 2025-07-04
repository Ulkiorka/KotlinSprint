package org.example.lesson_13

fun main() {
    val pepsi = Contact("Pepsi" , 999666)
    pepsi.printContact()
}

class Contact(
    val name: String ,
    val phoneNumber: Long ,
    val company: String? = null
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