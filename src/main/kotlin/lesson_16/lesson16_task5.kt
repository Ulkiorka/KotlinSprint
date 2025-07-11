package org.example.lesson_16

fun main() {
    val player = Player("Боец")
    while (player.getHP() > 0) {
        println("\nНовый раунд:")
        player.showStats()
        player.dealDamage()
        player.takeDamage((20..30).random())
        player.heal((5..10).random())
    }
}

class Player(
    val name: String,
) {
    private var healthPoints = 100
    private val hitForce = 15

    fun showStats() {
        println("У игрока [$name]: $healthPoints очков здоровья")
    }

    fun dealDamage() {
        if (healthPoints > 0)
            println("[$name] наносит противнику $hitForce очков урона")
        else
            return
    }

    fun takeDamage(damage: Int) {
        println("Противник наносит игроку $damage очков урона")
        healthPoints -= damage
        if (healthPoints <= 0) {
            println("$name убит")
            healthPoints = 0
            return
        }
    }

    fun heal(healPoints: Int) {
        if (healthPoints > 0) {
            healthPoints += healPoints
            println("[$name] вылечился на $healPoints очков здоровья")
        } else
            return
    }

    fun getHP(): Int {
        return healthPoints
    }
}