package org.example.lesson_15

fun main() {
    val user1 = User("Вася")
    val user2 = User("Петя")
    val admin = Administrator("Гжегош Бженчишчикевич")

    admin.writeMessage("Всем привет!")
    user1.writeMessage("Дороу!")
    user2.writeMessage("Нихао")

    user1.readMessage(2)
    admin.readMessage(1)

    admin.deleteMessage(1)
    admin.deleteUser(user1)
}

abstract class Members(val username: String) {
    abstract val role: String
    open fun readMessage(messageId: Int) {
        println("[$role $username] читает сообщение №$messageId")
    }

    open fun writeMessage(text: String) {
        println("[$role $username] пишет: $text")
    }
}

class Administrator(username: String) : Members(username) {
    override val role = "Админ"
    fun deleteMessage(messageId: Int) {
        println("[$role $username] удаляет сообщение №$messageId")
    }

    fun deleteUser(user: User) {
        println("[$role $username] удаляет пользователя ${user.username}")
    }
}

class User(username: String) : Members(username) {
    override val role = "юзер"
}