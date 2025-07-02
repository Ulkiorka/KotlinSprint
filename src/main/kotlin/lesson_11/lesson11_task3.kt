package org.example.lesson_11

import kotlin.Int

fun main() {
    val musicRoom = Room(
        1 , "http://site.com/volf.jpg" , "Чат-волчат"
    )

    printGroupInfo(musicRoom)

    val Vasya = User3(userId = 1 , avatarURL = "http://site.com/vasya.jpg" , username = "Vasya")
    val Kolya = User3(userId = 2 , username = "Kolya")

    printUserInfo(Vasya)
    printUserInfo(Kolya)

    musicRoom.addUser(Vasya)
    musicRoom.addUser(Kolya)

    printGroupInfo(musicRoom)

    musicRoom.updateUserStatus("Kolya" , UserStatus.MUTED)
    printUserInfo(Kolya)
}

class Room(
    val id: Int ,
    val coverURL: String ,
    val groupName: String ,
) {
    val users = mutableListOf<User3>()

    fun addUser(user: User3) {
        users.add(user)
        println("В $groupName добавлен пользователь ${user.username}")
        println()
    }

    fun updateUserStatus(userName: String , newStatus: UserStatus) {
        val userInGroup = users.find { it.username == userName }
        if (userInGroup != null) {
            userInGroup.status = newStatus
            println("У пользователя ${userInGroup.username} статус обновлён на ${userInGroup.status}")
            println()
        }
    }
}

class User3(
    val userId: Int ,
    val avatarURL: String = "http://site.com/noname.jpg" ,
    val username: String ,
    var status: UserStatus = UserStatus.MICROPHONE_OFF ,
)

enum class UserStatus {
    SPEAKING , MICROPHONE_OFF , MUTED
}

fun printGroupInfo(room: Room) {
    println("Информация о группе:")
    println("id: ${room.id}")
    println("coverURL: ${room.coverURL}")
    println("groupName: ${room.groupName}")
    println("users: ${room.users}")
    println()
}

fun printUserInfo(user: User3) {
    println("Информация о пользователе:")
    println("userId: ${user.userId}")
    println("coverURL: ${user.avatarURL}")
    println("groupName: ${user.username}")
    println("users: ${user.status}")
    println()
}

