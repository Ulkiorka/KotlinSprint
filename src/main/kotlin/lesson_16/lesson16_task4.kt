package org.example.lesson_16

fun main() {
    val order = Order(1, Status.TO_DO)
    order.showStatus()
    val newStatus = Status.IN_PROGRESS
    order.submitStatusChangeRequest(newStatus)
    println("Подтверждение менеджера получено")
    order.changeStatus(newStatus)
    order.showStatus()
}

class Order(private val id: Int, private var status: Status) {
    fun submitStatusChangeRequest(status: Status) {
        println("Получена заявка на смену статуса заказа, на $status. Ожидайте подтверждения от менеджера")
    }

    fun changeStatus(newStatus: Status) {
        status = newStatus
    }

    fun showStatus() {
        println("Текущий статус: $status")
    }
}

enum class Status {
    TO_DO, IN_PROGRESS, READY, COMPLETED
}